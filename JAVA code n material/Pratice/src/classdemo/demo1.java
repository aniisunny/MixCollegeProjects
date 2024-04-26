package classdemo;

class box{
	int length;
	int breadth;
	int height;
	box(){
		System.out.println("This is default constructor");
		length=17;
		breadth=13;
		height=6;
	}
	box(int length, int breadth, int height){
		System.out.println("This is parameterized constructor");
		this.length=length;
		this.height=height;
		this.breadth=breadth;
	}
	box(box temp){
		System.out.println("Constructor");
		length=temp.length;
		breadth=temp.breadth;
		height=temp.height;
	}
	int disvol() {
		return (length*breadth*height);
	}
}

public class demo1 {

	public static void main(String[] args) {
		box b1=new box();
		box b2=new box();
		box b3=b1;
		box b4=new box(23,16,7);
		box b5=new box(b4);
		b1.length=19;
		b1.breadth=14;
		b1.height=4;
		box b6=new box(b1);
		System.out.println("Volume of a box is " + b1.disvol());
		System.out.println("Volume of a box is " + b2.disvol());
		System.out.println("Volume of a box is " + b3.disvol());
		System.out.println("Volume of a box is " + b4.disvol());
		System.out.println("Volume of a box is " + b5.disvol());
		System.out.println("Volume of a box is " + b6.disvol());
	}
}