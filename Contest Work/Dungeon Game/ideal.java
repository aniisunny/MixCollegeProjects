import java.util.Scanner;

public class HelloWorld{
    
    static public int calculateMinimumHP (int[][] dungeon) {
		
		int m = dungeon.length;
		int n = dungeon[0].length;
		
		int[][] dp = new int[m][n];
		dp[m - 1][n - 1] = Math.max (1, 1 - dungeon[m - 1][n - 1]);
 
		for (int i = m - 2; i >= 0; i--) {
			dp[i][n - 1] = Math.max (1, dp[i + 1][n - 1] - dungeon[i][n - 1]);
		}
 
		for (int i = n - 2; i >= 0; i--) {
			dp[m - 1][i] = Math.max (1, dp[m - 1][i + 1] - dungeon[m - 1][i]);
		}
 
		for (int i = m - 2; i >= 0; i--) {
			for (int j = n - 2; j >= 0; j--) {
				int right = Math.max (1, dp[i][j + 1] - dungeon[i][j]);
				int down = Math.max (1, dp[i + 1][j] - dungeon[i][j]);
				dp[i][j] = Math.min (right, down);
			}
		}
 
		return dp[0][0];
	}

     public static void main(String []args){
        
        Scanner sc = new Scanner (System.in);
        int m = sc.nextInt ();
        int n = sc.nextInt ();
        
        int[][] dungeon = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dungeon[i][j] = sc.nextInt ();
            }
        }
        
        System.out.println (calculateMinimumHP (dungeon));
     }
}