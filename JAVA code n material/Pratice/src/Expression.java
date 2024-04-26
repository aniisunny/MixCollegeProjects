public class Expression {

	static String getAlphaNumericString() 
	{  
	    String AlphaNumericString = "123456789+-*/"; 
 
	    StringBuilder sb = new StringBuilder(1); 

	    int index = (int)(AlphaNumericString.length() * Math.random()); 

	    sb.append(AlphaNumericString.charAt(index)); 

	    return sb.toString(); 
	} 
	
	public static void main(String[] args) {
		

		int n = (int) Math.floor(Math.random() * 9);
		System.out.println(n);
		
		String[] s = new String[n];
		for(int i = 0; i < n; i++) {
			s[i] = getAlphaNumericString();
		}
		
		System.out.print("[");
		for(int i = 0; i < n; i++) {
			if(i != n - 1) System.out.print("\"" + s[i] + "\", ");
			else System.out.print("\"" + s[i] + "\"]");
		}
	}

}
