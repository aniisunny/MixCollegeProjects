public class TopKInput {
	
public static void main(String[] args) {
		
		int n = (int) Math.floor(Math.random() * 256);
		System.out.println(n);
		
		String[] arr = new String[n];
		for(int i = 0; i < n; i++) {
			
		}
		
		System.out.print("[");
		for(int i = 0; i < n; i++) {
			if(i != n - 1) System.out.print(arr[i] + ", ");
			else System.out.println(arr[i] + "]");
		}
		
		int k = (int) Math.floor(Math.random() * 128 % n);
		System.out.println(k);
		
	}

}
