package lab2018;

abstract class Vehicle {
	abstract long model();
	abstract String color();
}

class Car extends Vehicle {
	long model() {
		System.out.print("Model Number of car:-");
		return 7894653;
	}
	String color() {
		System.out.print("Colour of car:-");
		return "Black";
	}
}

class Truck extends Vehicle {
	long model() {
		System.out.print("Model Number of Truck:-");
		return 6578945;
	}
	String color() {
		System.out.print("Colour of Truck:-");
		return "Brown";
	}
}

class Jeep extends Vehicle {
	long model() {
		System.out.print("Model Number of Jeep:-");
		return 7569845;
	}
	String color() {
		System.out.print("Colour of Jeep:-");
		return "Grey";
	}
}

public class override {
	
public static void main(String[] args) {
		
		Vehicle c=new Car();
		System.out.println("Vehicle refer to Car::");
		System.out.println(c.model());
		System.out.println(c.color());
		Vehicle t=new Truck();
		System.out.println("\nVehicle refer to Truck::");
		System.out.println(t.model());
		System.out.println(t.color());
		Vehicle j=new Jeep();
		System.out.println("\nVehicle refer to Jeep::");
		System.out.println(j.model());
		System.out.println(j.color());
	}
}