
public class ListToArray {

	public static void main(String[] args) {
		
		String s = "[970, 2681, 2480, 4716, 496, 73, 8155, 7667, 4728, 3064, 6880, 7079, 1276, 8657, 2241, 747, 8830, 8482, 7522, 5025, 2526, 3389, 5236, 7370, 8085, 6878, 5545, 1856, 6034]";
		StringBuilder ans = new StringBuilder();
		for(char c : s.toCharArray()) {
			if(c == ',') ans.append(" ");
			else if(c != '[' && c != ']') ans.append(c);
		}
		
		System.out.println(ans);
	}

}
