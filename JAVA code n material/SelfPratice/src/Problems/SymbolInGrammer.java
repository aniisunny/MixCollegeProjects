package Problems;

public class SymbolInGrammer {
	
	static public int kthGrammar(int N, int K) {
        String s = grammer(N, K);
        if(K > Math.pow(2, N - 1))
        	return -1;
        return s.charAt(K - 1) - '0';
    }
    
    static private String grammer(int n, int k) {
        if(n == 1)
         return "0";
        String s = grammer(n - 1, k);
        String str = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0')
                str += "01";
            if(s.charAt(i) == '1')
                str += "10";
        }
        return str;
    }
	
	/*static public int kthGrammar(int N, int K) {
        String str = ""; 
        str = grammar(N, K, str);
        return str.charAt(K - 1) - '0';
    }
    
    static private String grammar(int n, int k, String str) {
        if(n == 1)
            return "" + 0;
        str = grammar(n - 1, k, str);
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '0')
                str += 01;
            if(str.charAt(i) == '1')
                str += 10;
        }
        return str;
    }*/

	public static void main(String[] args) {
		
		System.out.println(kthGrammar(30, 434991989));

	}

}
