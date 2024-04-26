package Problems;

public class TrappingRainWater2 {
	
	static int units = 0;
	
	static public int trap(int[] height) {
		
		int maxLeft, maxRight, posLeft, posRight, temp;
		maxLeft = maxRight = posLeft = posRight = temp = 0;
		for(int i = 1; i < height.length; i++) {
			maxLeft = maxRight = height[i];
			posLeft = posRight = i;
			
			for(int j = i - 1; j >= 0; j--) {
				if(height[j] >= maxLeft) {
					maxLeft = height[j];
					posLeft = j;
				}
			}
			
			for(int k = i + 1; k < height.length; k++) {
				if(height[k] >= maxRight) {
					maxRight = height[k];
					posRight = k;
				}
			}
			
			temp = Math.min(maxLeft, maxRight);
			
			while(++posLeft < posRight) {
				if(temp > height[posLeft])
					units += temp - height[posLeft];
			}
			i = posRight;
		}
		
		return units;
	}

	public static void main(String[] args) {
		
		//int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
		//int height[] = {4, 2 ,3};
		int height[] = {0, 7, 1, 4, 6};
		System.out.println(trap(height));
		
	}

}
