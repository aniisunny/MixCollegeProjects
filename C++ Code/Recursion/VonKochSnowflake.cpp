#define _USE_MATH_DEFINES
#include<cmath>

class VonKoch {
	
	double side, angle;
	int level;
	Cpoint currPt, pt;
	CDC *pen;
	
	void right(double x) {
		angle += x;
	}
	
	void left(double x) {
		angle -= x;
	}
	
	VonKoch(int side, int level, CDC *pDC) {
		pen = pDC;
		currPt.x = 200;
		currPt.y = 100;
		pen->MoveTo(currPt);
		angle = 0.0;
		this.side = side;
		this.level = level;
	}
	
	void drawFourLines(double side, int level) {
		// arguments to sin() and cos() are angles
		// specified in radians, i.e., the coefficient
		// PI / 180 is necessary
		if(level == 0) {
			pt.x = int(cos(angle * M_PI / 180) * side) + currPt.x;
			pt.y = int(sin(angle * M_PI /180) * side) + currPt.y;
			pen->LineTo(pt);
			currPt.x = pt.x;
			currPt.y = pt.y;
		}
		else {
			drawFourLines(side / 3, level - 1);
			left(60);
			drwaFourLines(side / 3, level - 1);
			right(120);
			drwaFourLines(side / 3, level - 1);
			left(60);
			drawFourLines(side / 3, level - 1);
		}
	}
	
	void snowFlake() {
		for(int i = 1; i <=3; i++) {
			drawFourLines(side, level);
			right(120);
		}
	}
};
