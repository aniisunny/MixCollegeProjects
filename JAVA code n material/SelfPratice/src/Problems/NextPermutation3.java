package Problems;

public class NextPermutation3 {
	
	static private void next(String s, int nums[]) {
		int t = Integer.parseInt(s);
		t++;
		Boolean flag = true;
		String str = "";
		while(t <= 999) {
			str = String.valueOf(t);
			for(int i = 0; i < str.length(); i++) {
				for(int j = 0; j < nums.length; j++) {
					if(nums[j] != str.charAt(i) - '0')
						flag =  false;
					else {
						flag = true;
						break;
					}
				}
			}
			if(flag == true)
				break;
			t++;
		}
		System.out.println(str);
	}
	
	static public int[] nextPermutation(int[] nums) {
		String s = "";
		for(int i = 0; i < nums.length; i++) {
			s += nums[i] + "";
		}
		next(s, nums);
		return nums;
	}

	public static void main(String[] args) {
		
		int nums[] = {1, 2, 3};
		for(int var : nextPermutation(nums)) 
			System.out.print(var + " ");

	}

}
