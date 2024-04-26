package classdemo;

public class accessmember {

	int n1=4;
	private int n2=10;
	protected int n3=5;
	public int n4=6;
	public accessmember() {
		System.out.println("Super class");
		System.out.println(n1 +" " + n2 +" " + n3 + " " +n4);
	}
}