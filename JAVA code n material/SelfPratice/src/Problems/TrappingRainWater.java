package Problems;

public class TrappingRainWater {
	
	static int units = 0;
	
	static public int trap(int[] height) {
		
		for(int i = 0; i < height.length; i++) {
			int temp = height[i];
			for(int j = i + 1; j < height.length; j++) {
				if(height[j] >= height[i] && height[j] != height[j - 1]) {
					for(int k = i - 1; k >= 0; k--) {
						if(height[k] > height[i] && height[k] > height[j]) {
							temp = height[j];
							break;
						}
					}
					helper(height, i, j, temp);
					i = j - 1;
					break;
				}
			}
		}
		
		return units;
	}
	
	static protected void helper(int[] height, int i, int j, int temp) {
		while(i < j) {
			if(temp > height[i])
				units += temp - height[i];
			i++;
		}
	}

	public static void main(String[] args) {
		
		//int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		//int height[] = {4, 2 ,3};
		int height[] = {0, 7, 1, 4, 6};
		//int height[] = {4, 4, 4, 7, 1, 0};
		//int height[] = {0, 5, 6, 4, 6, 1, 0, 0, 2, 7};
		System.out.println(trap(height));

	}

}
