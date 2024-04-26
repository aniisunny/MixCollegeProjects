package Problems;

import java.util.Arrays;

public class TrappingRainWater3 {
	
	/*static public int trap(int[] height) {
		int units = 0;
		for(int i = 1; i < height.length - 1; i++) {
			int leftMax = 0,rightMax = 0;
			for(int j = 0; j < i; j++) {
				leftMax = Math.max(leftMax, height[j]);
			}
			for(int j = i + 1; j < height.length; j++) {
				rightMax = Math.max(rightMax, height[j]);
				if(rightMax > leftMax)
					break;
			}
			int min = Math.min(leftMax, rightMax);
			if(min > height[i])
				units += min - height[i];
		}
		return units;
	}*/
	
	static public int trap(int[] height) {
		int units = 0;
		int maxSeenSoFar = 0;
		int maxSeenRight[] = new int[height.length];
		int maxSeenLeft = 0;
		for(int i = height.length - 1; i >= 0; i--) {
			if(height[i] > maxSeenSoFar) {
				maxSeenSoFar = height[i];
				maxSeenRight[i] = maxSeenSoFar;
			}
			else
				maxSeenRight[i] = maxSeenSoFar;
		}
		for(int i = 0; i < height.length; i++) {
			units += Integer.max(Integer.min(maxSeenLeft, maxSeenRight[i]) - height[i], 0);
			if(height[i] > maxSeenLeft)
				maxSeenLeft = height[i];
		}
		return units;
	}

	public static void main(String[] args) {
		
		//int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		//int height[] = {4, 2 ,3};
		//int height[] = {0, 7, 1, 4, 6};
		//int height[] = {4, 4, 4, 7, 1, 0};
		int height[] = {0, 5, 6, 4, 6, 1, 0, 0, 2, 7};
		System.out.println(trap(height));

	}

}
