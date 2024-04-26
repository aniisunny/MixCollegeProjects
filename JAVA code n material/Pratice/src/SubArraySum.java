import java.util.Random;

public class SubArraySum {

	public static void main(String[] args) {
		
		int n = (int) Math.floor(-50 + Math.random()*4587);
		System.out.println(n);
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = -8654 + new Random().nextInt(9451);
		
		System.out.print("[");
		for(int i = 0; i < n; i++) {
			if(i != n - 1) System.out.print(arr[i] + ", ");
			else System.out.println(arr[i] + "]");
		}
		
		int k = (int) Math.floor(Math.random()*9315);
		System.out.println(k);
		
	}
}
