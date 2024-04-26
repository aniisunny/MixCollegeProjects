package Aggregation;

public class employee {

	int id;
	String name;
	address address;
	employee(int id,String name,address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display() {
		System.out.println("Employee Details:-");
		System.out.println("id:-" +id);
		System.out.println("name:-" +name);
		System.out.println("city:-" +address.city);
		System.out.println("state:-" +address.state);
		System.out.println("country:-" +address.country);
	}
	
	public static void main(String[] args) {
		
		address address1=new address("Mathura","Uttar Pradesh","INDIA");
		employee emp=new employee(3264,"Aniruddha M. Agrawal",address1);
		emp.display();
	}
}