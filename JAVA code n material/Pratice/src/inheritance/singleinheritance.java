package inheritance;

class Electronics1 {
	void types() {
		System.out.println("Electronic Items:-");
		System.out.println("Mobiles\nEarphones\nTrimmer");
	}
}

class Mobile1 extends Electronics1 {
	void company() {
		System.out.println("Mobile Companies:-");
		System.out.println("MI\nApple\nSamsung");
	}
}

public class singleinheritance {
	
	public static void main(String[] args) {
		
		Mobile1 m=new Mobile1();
		m.types();
		m.company();
	}
}