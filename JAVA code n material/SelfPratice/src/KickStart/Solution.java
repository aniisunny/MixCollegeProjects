package KickStart;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

class Coaching {
	int n;
	int p;
	int rating[];
}

public class Solution {
	
	static HashMap<Integer, Coaching> map = new HashMap<Integer,Coaching>();
	
	static int training(int k) throws IOException {
		int hours = 0;
		if(map.containsKey(k)) {
			Coaching p = map.get(k);
			int arr[] = new int[p.p];
			int j = 0;
			for(int i = 0; i < p.rating.length; i++) {
				if(j != p.p) {
					arr[j] = p.rating[i];
					j++;
				}
			}
			Arrays.sort(arr);
			for(int i = 0; i < arr.length - 1; i++) {
				hours += arr[arr.length - 1] - arr[i];
			}
		}
		return hours;
	}

	public static void main(String[] args) throws Exception {
		
		DataInputStream dis;
		String filePath = "E:\\JAVA code n material\\SelfPratice\\src\\KickStart\\FootballTraining.txt";
		FileInputStream fis = new FileInputStream(filePath);
		dis = new DataInputStream(fis);
		String str = dis.readLine();
		int t = Integer.parseInt(str);
		for(int k = 1; k <= t; k++) {
			Coaching p = new Coaching();
			for(int i = 1; i <= 2; i++) {
				if(fis.available() != 0 && i == 1) {
					String sarr[] = (dis.readLine()).split(" ");
					p.n = Integer.parseInt(sarr[0]);
					p.p = Integer.parseInt(sarr[1]);
				}
				if(fis.available() != 0 && i == 2) {
					String sarr[] = (dis.readLine()).split(" ");
					p.rating = new int[p.n];
					for(int j = 0; j < p.n; j++) 
						p.rating[j] = Integer.parseInt(sarr[j]);
					map.put(k, p);
				}
			}
		}
		dis.close();
		fis.close();
		FileWriter fos = new FileWriter("Output.txt");
		for(int k = 1; k <= t; k++) {
			int hours = training(k);
			String str1 = "Case #" + k + ": " + hours;
			fos.write(str1);
			fos.write("\n");
		}
		fos.close();
	}

}
