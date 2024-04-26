#include<iostream>
using namespace std;

    double myPow(double x, int n) {
		long m = (long)n;
		if(m < 0) {
			m = -m;
			x = 1 / x;
		}
		double power = 1;
		while(m > 0) {
			if(m % 2 == 1)
				power *= x;
			x *= x;
			m /= 2;
		}
		return power;
	}

	int main() {
	    double x = 2.00;
		int n = -2;
		cout<<myPow(x, n);
	}
