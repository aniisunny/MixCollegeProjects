package Problems;

import java.util.LinkedList;
import java.util.List;

public class GrayCode {
	
	static public List<Integer> grayCode(int n) {
        List<Integer> list = new LinkedList<Integer>();
        if(n == 0) {
            list.add(0);
            return list;
        }
        String s = "0";
        for(int i = 2; i <= n; i++) {
            s += "0";
        }
        list.add(0);
        for(int i = s.length() - 1; i >= 0; i--) {
            StringBuilder sb = new StringBuilder(s);
            s = sb.replace(i, i + 1, "1").toString();
            System.out.println(s);
        }
        return list;
    }

	public static void main(String[] args) {
		
		System.out.println(grayCode(3));

	}

}
