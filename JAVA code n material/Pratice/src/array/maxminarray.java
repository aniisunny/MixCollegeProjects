package array;

public class maxminarray {

	public static void main(String[] args) {
		int a[]= {2,8,6,7,4,6,2,15,56,1,6,9,3,7,2,8};
		int min=a[0],max=a[a.length-1],pos1=0,pos2=0;
		for(int i=0;i<a.length;i++) {
			if(min>=a[i]) {
				min=a[i];
				pos1=i+1;
			}
			else if(max<=a[i]) {
				max=a[i];
				pos2=i+1;
			}
		}
		System.out.println("Minimum element in an array is " +min +" at " +pos1 + " position.");
		System.out.println("Maximum element in an array is " +max +" at " +pos2 + " position.");
	}
}