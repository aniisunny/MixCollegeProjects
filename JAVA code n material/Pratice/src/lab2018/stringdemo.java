package lab2018;

public class stringdemo {

	public static void main(String[] args) {
		
		String s1=new String("roHAn");
		System.out.println(s1.charAt(3));
		System.out.println((int)s1.charAt(3));
		System.out.println(s1.codePointAt(3));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(Character.toLowerCase('E'));
		System.out.println(Character.toUpperCase('q'));
		System.out.println(Character.isUpperCase('E'));
		System.out.println(Character.isLowerCase('Q'));
		String temp="";
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
		    if(Character.isLowerCase(ch)) 
		    	temp+=Character.toUpperCase(ch);
		    else 
		    	temp+=Character.toLowerCase(ch);
		}
		System.out.println(temp);
		String s2="  rajiv    is a student  ";
		System.out.println(s2);
		System.out.println(s2.trim());
		System.out.println(s2);
		System.out.println(s2=s2.trim());
		System.out.println(s2);
		String s3="   rajiv:is:a:student   ";
		String tep[]=s3.split(":");
		for(String s:tep) {
			System.out.println(s);
		}
		String s4="nitinnitinnitinnitin";
		String t[]=s4.split("tin");
		for(String s:t) {
			System.out.println(s);
		}
		char charr[]=s4.toCharArray();
		String te=charr.toString();
		System.out.println(te);
	}
}