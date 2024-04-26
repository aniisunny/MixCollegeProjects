package Problems;

public class MultiplyString {
	
	 static public String multiply(String num1, String num2) {
		 if(num1.equals("0") || num2.equals("0"))
			 return "0";
		 String multiply = "0";
		 int hold = 0;
	     for(int i = num2.length() - 1; i >= 0; i--) {
	    	 int carry = 0;
	         String temp = "";
	         for(int j = num1.length() - 1; j >= 0; j--) {
	        	 int t = (Integer.parseInt(num2.charAt(i) + "") * Integer.parseInt(num1.charAt(j) + "")) + carry;
	        	 int remainder = t % 10;
	        	 carry = t / 10;
	        	 temp = remainder + temp;
	        }
	        int k, t;
	        for(k = 1; k <= hold; k++)
	        	temp += "0";
	        hold++;
	        if(carry != 0) {
	        	temp = carry + temp;
	        }
	        System.out.println("temp = " + temp);
	        int carry1 = 0;
	        String str = "";
	        boolean flag = false;
	        if(multiply.length() >= temp.length()) {
	        	for(k = temp.length() - 1, t = multiply.length() - 1; k >= 0; k--, t--) {
	        		int x = (Integer.parseInt(temp.charAt(k) + "") + Integer.parseInt(multiply.charAt(t) + "")) + carry1;
	        		carry1 = x / 10;
	        		str = (x % 10) + str;
	        	}
	        	flag = true;
	        }
	        else {
	        	for(k = temp.length() - 1, t = multiply.length() - 1; t >= 0; k--, t--) {
	        		int x = (Integer.parseInt(temp.charAt(k) + "") + Integer.parseInt(multiply.charAt(t) + "")) + carry1;
	        		carry1 = x / 10;
	        		str = (x % 10) + str;
	        	}
	        }
	        if(flag == true) {
	        	if(carry1 != 0) {
	        		for(k = t; k >= 0; k--) {
	        			int x = Integer.parseInt(temp.charAt(k) + "") + carry1;
	        			carry1 = x / 10;
	        			str = (x % 10) + str;
	        		}
	        	}
	        	else {
	        		for(k = t; k >= 0; k--) {
		        		str = multiply.charAt(k) + str;
		        	}
	        	}
	        }
	        else {
	        	if(carry1 != 0) {
	        		for(t = k; t >= 0; t--) {
	        			int x = Integer.parseInt(temp.charAt(t) + "") + carry1;
	        			carry1 = x / 10;
	        			str = (x % 10) + str;
	        		}
	        	}
	        	else {
	        		for(t = k; t >= 0; t--) {
		        		str = temp.charAt(t) + str;
		        	}
	        	}
	        }
	        if(carry1 != 0)
	        	str = carry1 + str;
	        multiply = str;
	        System.out.println("multiply = " + multiply);
	     }
	     return multiply;
	 }

	public static void main(String[] args) {
		
		String num1 = "9193";
		String num2 = "53";
		System.out.println(multiply(num1, num2));

	}

}
