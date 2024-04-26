package abstraction;

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Rectangle is drawing");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Circle is drawing");
	}
}

public class testabstraction {

	public static void main(String[] args) {
		
		Shape s=new Circle();
		s.draw();
		s=new Rectangle();
		s.draw();
	}
}