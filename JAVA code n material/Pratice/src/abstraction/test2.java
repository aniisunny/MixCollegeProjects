package abstraction;

abstract class Bike {
	Bike() {
		System.out.println("Bike is Created");
	}
	abstract void run();
	void changeGear() {
		System.out.println("Gear Changed");
	}
}

class Honda extends Bike {
	void run() {
		System.out.println("Running Safety");
	}
}

public class test2 {

	public static void main(String[] args) {
		
		Bike b=new Honda();
		b.run();
		b.changeGear();
	}
}