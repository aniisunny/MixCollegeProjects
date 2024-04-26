package Aggregation;

class operation {
	float square(float r) {
		return r*r;
	}
}

class circle {
	operation op;
	double pi=3.14;
	double area(float radius) {
		op=new operation();
		return (pi*op.square(radius));
	}
}

public class example {

	public static void main(String[] args) {
		
		circle c=new circle();
		System.out.println("Area of cirle is " + c.area(16));
		//System.out.println("Area of cirle is " + c.area(16.7));
	}
}