package GoogleHashCode;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

class Pair {
	Character position;
	int n;
	LinkedList<String> list = new LinkedList<String>();
	
	Pair(Character position, int n, LinkedList<String> list) {
		this.position = position;
		this.n = n;
		this.list = list;
	}
}

public class Input1 {
	private static DataInputStream dis;

	static public void input() throws Exception{
		String filepath = "E:\\JAVA code n material\\SelfPratice\\src\\GoogleHashCode\\a_example.txt";
 		FileInputStream fis = new FileInputStream(filepath);
		dis = new DataInputStream(fis);
		LinkedList<String> list;
		HashMap<Integer, Pair> map = new HashMap<Integer, Pair>();
		Pair psan = null;
		int photos = 0;
		@SuppressWarnings("deprecation")
		String str = dis.readLine();
		photos = Integer.parseInt(str);
		for(int i = 0; i < photos; i++) {
			if(fis.available() != 0) {
				@SuppressWarnings("deprecation")
				String sarr[] = (dis.readLine()).split(" ");
				char ch = sarr[0].charAt(0);
				int n = Integer.parseInt(sarr[1]);
				list = new LinkedList<String>();
				for(int j = 2; j < sarr.length; j++) {
					list.add(sarr[j]);
				}
				psan = new Pair(ch, n, list);
			}
			map.put(i, psan);
		}
		System.out.println(map);
		dis.close();
		fis.close();
		LinkedList<LinkedList<Integer>> list2 = new LinkedList<LinkedList<Integer>>();
		for(int i = 0; i < photos; i++) {
			if(map.containsKey(i)) {
				Pair p = map.get(i);
				if(p.position == 'H') {
					Iterator<String> itr = p.list.iterator();
					loop:
					while(itr.hasNext()) {
						String s = itr.next();
						for(int j = i + 1; j < photos; j++) {
							if(map.containsKey(j)) {
								Pair p1 = map.get(j);
								if(p1.position == 'H') {
									Iterator<String> itr1 = p.list.iterator();
									while(itr1.hasNext()) {
										String s1 = itr1.next();
										if(s.equals(s1)) {
											LinkedList<Integer> temp = new LinkedList<Integer>();
											temp.add(i);
											list2.add(temp);
											LinkedList<Integer> temp2 = new LinkedList<Integer>();
											temp2.add(j);
											list2.add(temp2);
											break loop;
										}
									}
								}
							}
						}
					}
				}
				else if(p.position == 'V') {
					Iterator<String> itr = p.list.iterator();
					loop:
					while(itr.hasNext()) {
						String s = itr.next();
						for(int j = i + 1; j < photos; j++) {
							if(map.containsKey(j)) {
								Pair p1 = map.get(j);
								if(p1.position == 'V') {
									Iterator<String> itr1 = p.list.iterator();
									while(itr1.hasNext()) {
										String s1 = itr1.next();
										if(s.equals(s1)) {
											LinkedList<Integer> temp1 = new LinkedList<Integer>();
											temp1.add(i);
											temp1.add(j);
											list2.add(temp1);
											break loop;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(list2);
		FileWriter fos = new FileWriter("Output1.txt");
				
		fos.write(new Integer(list2.size()).toString());
		fos.write("\n");
		
		Iterator<LinkedList<Integer>> itr = list2.iterator();
		while(itr.hasNext()) {
			LinkedList<Integer> temp = itr.next();
			Iterator<Integer> itr1 = temp.iterator();
			while(itr1.hasNext()) {
				int x = itr1.next();
				fos.write(new Integer(x).toString());
				fos.write(" ");
			}
			fos.write("\n");
		}
		fos.close();
	}

	public static void main(String[] args) throws Exception{
		
		input();

	}

}
