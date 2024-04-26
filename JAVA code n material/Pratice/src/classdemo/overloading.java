package classdemo;

abstract class GeneralBank {
	double getSavingInterestRate() {
		System.out.println("GeneralBank Saving Interest");
		return 0.0;
	}
	abstract double getFixedInterestRate();
}

class ICICIBank extends GeneralBank{
	double getSavingInterestRate() {
	System.out.println("ICICIBank Saving Interest");
	return 4.0;
	}
	double getFixedInterestRate() {
		System.out.println("ICICIBank Fixed Interest");
		return 8.4;
	}
}

class KotMBank extends GeneralBank {
	double getSavingInterestRate() {
		System.out.println("KotMBank Saving Interest");
		return 6.0;
	}
	double getFixedInterestRate() {
		System.out.println("KotMBank Fixed Interest");
		return 9.0;
	}
}

class vehicle {
	void run() {
		System.out.println("Vehicle is running");
	}
}

class bike extends vehicle {
	void run() {
		System.out.println("Bike is running safety");
	}
}

class car extends vehicle {
}

public class overloading {    
	static long sum(int a,long b) {
		return a+b;
	}
	static int sum(int a,int b,int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		
		System.out.println("Method Overriding:-");
		ICICIBank obj1=new ICICIBank();     //overriding
		System.out.println("ICICI::");
		System.out.println(obj1.getFixedInterestRate());
		System.out.println(obj1.getSavingInterestRate());
		KotMBank obj2=new KotMBank();
		System.out.println("\nKotMBank::");
		System.out.println(obj2.getFixedInterestRate());
		System.out.println(obj2.getSavingInterestRate());
		GeneralBank obj3=new ICICIBank();
		System.out.println("\nGeneralBank refer to ICICI Bank::");
		System.out.println(obj3.getFixedInterestRate());
		System.out.println(obj3.getSavingInterestRate());
		obj3=new KotMBank();
		System.out.println("\nGeneralBank refer to KotM Bank::");
		System.out.println(obj3.getFixedInterestRate());
		System.out.println(obj3.getSavingInterestRate());
		System.out.println();
		car c=new car();
		c.run();
		bike b=new bike();
		b.run();          //overriding
		overloading ob=new overloading();
		System.out.println("\nMethod Overloading:-");
		System.out.println(ob.sum(10,500));
		System.out.println(ob.sum(10,20,30));
	}
}