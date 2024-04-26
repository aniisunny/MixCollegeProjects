package Problems;

public class LongestPalindroamicSubString2 {
	
	static String longestPalindrome ( String s ) {
		
		int temp [][] = new int [ s.length () ] [ s.length () ]; 
		 for ( int i = 0; i < s.length (); i ++ ) {			 
			 for ( int j = 0; j < s.length(); j ++ ) {
				 
				 if ( s.charAt ( i ) == s.charAt ( s.length() - j - 1) ) {
//					 System.out.println(i + " " + j);
//					 System.out.println(s.charAt(i) + " " + s.charAt(s.length() - j - 1));
					 
					 temp [ i ] [ j ] = 1;
					 if ( j != 0  && i != 0 ) {		 
						 temp [ i ] [ j ] += temp [ i - 1 ] [ j - 1 ];
					 }					 
				 }
			 }
		 }
		 
		 int largest = 0, pos = 0;
		 
		 for ( int i = 0 ; i < s.length (); i ++ ) {
			 
			 for ( int j = 0; j < s.length(); j ++ ) {
				 
//				 System.out.print ( temp [ i ] [ j ] + " " );
				 
				 if ( temp [ i ] [ j ] >= largest ) {
					 
					 largest = temp [ i ] [ j ];
					 pos = i;
					 
				 }
				 
			 }
//			 System.out.println();
			 
		 }
		 
		 String palindroame = "";
		 System.out.println(largest);
		 
		 for ( int i = pos; i > pos - largest ; i -- ) {
			 
			 palindroame += s.charAt ( i );
			 
		 }
		
		return palindroame;
		
	}

	public static void main(String[] args) {
		
		String s = "aacdefcaa";
		
		/*String s = "\"rgczcpratwyqxaszbuwwcadruayhasynuxnakpmsy"
				+ "hxzlnxmdtsqqlmwnbxvmgvllafrpmlfuqpbhjddmhmbcgmlye"
				+ "ypkfpreddyencsdmgxysctpubvgeedhurvizgqxclhpfrvxggrow"
				+ "aynrtuwvvvwnqlowdihtrdzjffrgoeqivnprdnpvfjuhycpfydj"
				+ "cpfcnkpyujljiesmuxhtizzvwhvpqylvcirwqsmpptyhcqybsts"
				+ "fgjadicwzycswwmpluvzqdvnhkcofptqrzgjqtbvbdxylrylins"
				+ "pncrkxclykccbwridpqckstxdjawvziucrswpsfmisqiozworib"
				+ "eycuarcidbljslwbalcemgymnsxfziattdylrulwrybzztoxhev"
				+ "sdnvvljfzzrgcmagshucoalfiuapgzpqgjjgqsmcvtdsvehewrv"
				+ "tkeqwgmatqdpwlayjcxcavjmgpdyklrjcqvxjqbjucfubgmgpkf"
				+ "dxznkhcejscymuildfnuxwmuklntnyycdcscioimenaeohgpbcp"
				+ "ogyifcsatfxeslstkjclauqmywacizyapxlgtcchlxkvygzeucw"
				+ "alhvhbwkvbceqajstxzzppcxoanhyfkgwaelsfdeeviqogjpres"
				+ "noacegfeejyychabkhszcokdxpaqrprwfdahjqkfptwpeykgumy"
				+ "emgkccynxuvbdpjlrbgqtcqulxodurugofuwzudnhgxdrbbxtrv"
				+ "dnlodyhsifvyspejenpdckevzqrexplpcqtwtxlimfrsjumiygq"
				+ "eemhihcxyngsemcolrnlyhqlbqbcestadoxtrdvcgucntjnfavylip\"";*/
		
		System.out.println ( "Longest Palindromic Substring :- " + longestPalindrome ( s ) );

	}

}