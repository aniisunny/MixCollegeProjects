package Problems;

public class NextPermutation2 {
	static public int next(int n, int[] nums) {
		final int og = n;
		n++;
		boolean flag = true;
		if(n > og) {
			int temp = n;
			loop:
			while(temp != 0) {
				for(int var : nums) {
					if(var != temp%10) {
						flag = false;
						break loop;
					}
				temp /= 10;
				}
			}
		}
		if(flag == false)
			next(n, nums);
		return n;
	}
	
	static public void nextPermutation(int[] nums) {
		String str = "";
		for(int var : nums) {
			str += var;
		}
		int n = next(Integer.parseInt(str), nums);
	}

	public static void main(String[] args) {
		
		//int nums [] = { 3, 2, 1 };
		int nums [] = { 2, 2, 5, 7, 1, 1 };
		//int nums [] = { 5, 3, 4, 9, 7, 6 };
		//int nums [] = { 2, 2, 5, 7, 6, 1 };
		//int nums [] = { 2, 2, 5, 7, 3, 1 };
		//int nums [] = { 4, 3, 2, 1 };
		
		nextPermutation ( nums );

	}

}
