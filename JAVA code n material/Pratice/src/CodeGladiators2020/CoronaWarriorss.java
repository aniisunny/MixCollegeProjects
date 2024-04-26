package CodeGladiators2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoronaWarriorss {

	static int patients;
    static int doctors;
    static int[][] arr;
    static boolean flag[];
    static int constant = Integer.MAX_VALUE;
    static int dp[][][];
    
    private static int helper (int start, int end, int temp) {
        if (start >= patients) {
            return 0;
        }
        else if (dp[start][temp][end] != constant) {
            return dp[start][temp][end];
        }
        
        int ans = Integer.MAX_VALUE;
        
        for (int i = 0; i < doctors; i++) {
            if (!flag [i]) {
                flag[i] = true;
                temp += (1 << i);
                ans = Math.min (ans, helper (start + 1, i, temp) + arr[i][start]);
                temp -= (1 << i);
                flag[i] = false;
            }
            else if (i == end) {
                ans = Math.min (ans, helper (start + 1, i, temp) + arr[i][start]);
            }
        }
        
        dp[start][temp][end] = ans;
        
        return dp[start][temp][end];
    }
    
	public static void main(String[] args) throws IOException {
		
		try (BufferedReader read = new BufferedReader (new InputStreamReader (System.in))) {
			String[] s = read.readLine ().split (" ");
			patients = Integer.parseInt (s[0]);
			doctors = Integer.parseInt (s[1]);
			
			dp = new int[patients][2048][doctors];
			
			for (int i = 0; i < patients; i++) {
	            for (int j = 0; j < 2048; j++) {
	                for (int k = 0; k < doctors; k++) {
	                    dp[i][j][k] = constant;
	                }
	            }
	        }
			
			arr = new int[doctors][patients];
			flag = new boolean[doctors];
			
			for (int i = 0; i < doctors; i++) {
				s = read.readLine ().split (" ");
			    for (int j = 0; j < patients; j++) {
			        arr[i][j] = Integer.parseInt (s[j]);
			    }
			}
			
			int temp = 0;
			int ans = Integer.MAX_VALUE;
			
			for (int i = 0; i < doctors; i++) {
			    temp += (1 << i);
			    flag[i] = true;
			    ans = Math.min (ans, helper (1, i, temp) + arr[i][0]);
			    temp -= (1 << i);
			    flag[i] = false;
			}
			
			System.out.println (ans);
		}
	}
}
