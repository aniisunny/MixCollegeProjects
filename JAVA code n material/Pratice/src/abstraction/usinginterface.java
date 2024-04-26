package abstraction;

interface A {
	void A();
	void B();
	void C();
	void D();
}

abstract class B implements A {
	public void C() {
		System.out.println("I AM C");
	}
}

class M extends B {
	public void A() {
		System.out.println("I AM A");
	}
	public void B() {
		System.out.println("I AM B");
	}
	public void D() {
		System.out.println("I AM D");
	}
}

public class usinginterface {

	public static void main(String[] args) {
		
		A a=new M();
		a.A();
		a.B();
		a.C();
		a.D();
	}
}