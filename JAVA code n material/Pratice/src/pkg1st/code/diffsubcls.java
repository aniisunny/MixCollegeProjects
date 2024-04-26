package pkg1st.code;

public class diffsubcls {

	public static void main(String []args) {
		
		classdemo.accessmember ob=new classdemo.accessmember();
		System.out.println("Different package  non subclass");
		//System.out.println(n1);
		//System.out.println(n2); 
		//System.out.println(ob.n3);
		System.out.println(ob.n4);
		
		diffpkgsubcls ob1=new diffpkgsubcls();
		System.out.println("same package subclass");
		//System.out.println(ob1.n1);
		//System.out.println(ob1.n2); 
		//System.out.println(ob1.n3);
		System.out.println(ob1.n4);
	}
}