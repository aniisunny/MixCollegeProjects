package JavaArrayList;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ArrayList8 {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<String>();
		al.add("Anii Agrawal");
		al.add("Tokyo");
		al.add("Professor");
		
		try {
			FileOutputStream fos = new FileOutputStream("File");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			fos.close();
			oos.close();
			
			FileInputStream fis = new FileInputStream("File");
			ObjectInputStream ois = new ObjectInputStream(fis);
			System.out.println(ois.readObject());
		} catch(Exception e) {
			
		}
	}

}
