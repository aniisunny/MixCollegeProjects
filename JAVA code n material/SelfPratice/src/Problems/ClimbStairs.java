package Problems;

public class ClimbStairs {
	
	static public int climbStairs(int n) {
		int memo[] = new int[n + 1];
		return climb_Stairs(0, n, memo);
	}
	
	static private int climb_Stairs(int i, int n, int memo[]) {
		if(i > n)
			return 0;
		if(i == n)
			return 1;
		if(memo[i] > 0)
			return memo[i];
		memo[i] = climb_Stairs(i + 1, n, memo) + climb_Stairs(i + 2, n, memo);
		return memo[i];
	}

	public static void main(String[] args) {
		
		System.out.println(climbStairs(8));

	}

}
