package Interface;

import InterfacePackage.MyInterface1; 

interface MyInterface2 extends MyInterface1 {
	public abstract void callBack (); //by default methods are public and abstract
	String display (); //by default methods are public and abstract
}

class MyClass1 implements MyInterface2 {
	public void callBack ( int a ) {
		System.out.println ( "myclass1 callback mtd..." + a );
	}
	public void callBack () {
		System.out.println ( "method overloaded" );
	}
	public String display () {
		return "Aniruddha";
	}
}

class MyClass2 implements MyInterface1 {
	public void callBack ( int a ) {
		System.out.println ( "myclass2 callback mtd..." );
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
		new MyClass1 () . callBack ( 12 );
		new MyClass1 () . callBack ();
		System.out.println ( new MyClass1 () . display () );
		new  MyClass2().callBack(13);
	}
}