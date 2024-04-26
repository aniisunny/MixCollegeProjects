package lab2018;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	
	//static int eid;
	//transient String ename;    // always take default values i.e. it is string so default value is null
	
	 int eid;
	 String ename;
	
	Employee ( int eid, String ename ) {
		
		this.eid = eid;
		this.ename = ename;
		
	}
	
}

public class FileObject {

	public static void main(String[] args) throws Exception {

		Employee ob1 = new Employee ( 123, "Rohan" );
		Employee ob2 = new Employee ( 124, "Sohan" );
		
		FileOutputStream fos = new FileOutputStream ( "today22.txt" );
		ObjectOutputStream oos = new ObjectOutputStream ( fos );
		
		oos.writeObject ( ob1 );
		oos.writeObject ( ob2 );
		oos.writeObject ( ob2 );
		
		oos.close ();
		fos.close ();
		
		FileInputStream fis = new FileInputStream ( "today22.txt" );
		ObjectInputStream ois = new ObjectInputStream ( fis );
		
		while ( fis.available () != 0 ) {
			
			Employee temp = ( Employee ) ois.readObject ();
			System.out.println ( temp.eid + " " + temp.ename );
			
		}
		
		ois.close ();
		fis.close ();
		
	}

}
