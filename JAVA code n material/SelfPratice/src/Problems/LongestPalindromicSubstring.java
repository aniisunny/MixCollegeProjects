package Problems;

import java.util.Scanner;
import java.lang.NullPointerException;

public class LongestPalindromicSubstring {
	
	static String longestPalindrome ( String s ) {
		
		String substring [ ] = new String [ s.length () ];
		int i, j, k = 0;
		
		if ( s.isEmpty()  ) {
			
			return "";
			
		}
		
		else {
			
			String palindrome [ ] = new String [ s.length () ];
			
			for ( i = 0; i < s.length (); i++ ) {
				
				substring [ i ] = s.charAt ( i ) + "";
				
				for ( j = i + 1; j < s.length (); j++ ) {
					
					substring [ i ] += s.charAt ( j ); 
					
					if ( s.charAt ( i ) == s.charAt ( j ) ) {
						
						StringBuffer sb = new StringBuffer ( substring [ i ] );
						String reverse = sb.reverse (). toString ();
						
						if ( reverse.equals ( substring [ i ] ) ) {
							
							palindrome [ k ] = reverse;
							k++;
							break;
							
						}
						
					}
					
				}
				
			}
			
			int temp = 0;
			
			if ( palindrome [ 0 ] != null ) {
				
				int length = palindrome [ 0 ].length ();
				i = 1;
				
				while ( palindrome [ i ] != null ) {
					
					if ( palindrome [ i ].length () >= length ) {
						
						length = palindrome [ i ].length ();
						temp = i;
						
					}
					
					i++;
					
				}
				
				for ( String w : palindrome )
				System.out.println ( w );
				
				return palindrome [ temp ];
				
			}
			
		}
		
		return substring [ i - 1 ]; 
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in );
		//System.out.print ( "Enter the String:- " );
		//String s = sc.nextLine ();
		String s = "\"rgczcpratwyqxaszbuwwcadruayhasynuxnakpmsy"
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
				+ "eemhihcxyngsemcolrnlyhqlbqbcestadoxtrdvcgucntjnfavylip\"";
		System.out.println ( "Longest Palindromic Substring :- " + longestPalindrome ( s ) );

	}

}
