package Problems;

import java.util.Scanner;

public class LongestPalindromicSubString1 {
	
	static String longestPalindrome ( String s ) {
		
		if ( s.isEmpty () )
			return s;
		
		int i, j, length = 0;
		String largest = "";
		
		for ( i = 0; i < s.length (); i++ ) 
			
			for ( j = i; j <= s.length (); j++ ) {
				
				String str = new StringBuffer ( s ).substring ( i, j ).toString ();
				System.out.println(str);
				String reverse = new StringBuffer ( str ).reverse ().toString ();
				
				if ( str.equals ( reverse ) ) 
					
					if ( str.length () >= length ) {
						
						length = str.length();
						largest = str;
						
					}
				
			}
		
		return largest;
		
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner ( System.in );
		//System.out.print ( "Enter the String:- " );
		String s = sc.nextLine ();
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
