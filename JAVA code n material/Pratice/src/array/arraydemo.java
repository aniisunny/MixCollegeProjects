package array;

public class arraydemo {
	public static void main(String[] args) {
		int arr[][]={{17,43,57},{89,57,89}};
		int arr1[]=new int[] {45,90,89,78};
		int arr2[][][]={ {
			{1,6,8},{4,7,9},{7,8}
		},
		{
			{3,7,9},{7,9,8},{3,7,9}
		}
		};
		System.out.println("No of elements in 1-D Array:"+arr1.length);
		for(int var:arr1){
			System.out.print(var + " ");
		}
		System.out.println();
		System.out.println("No of elements in 2-D Array:"+arr.length);
		for(int x[]:arr){
			for(int y:x){
				System.out.print(y + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("No of elements in 3-D Array:"+arr2.length);
		for(int x[][]:arr2){
			for(int y[]:x){
				for(int z:y){
				System.out.print(z + " ");
			}
			System.out.println();
		}
			System.out.println();
		}
	}
}