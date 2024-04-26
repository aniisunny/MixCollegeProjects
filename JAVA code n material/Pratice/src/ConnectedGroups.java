import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class Pair {
	int i, j;
	
	public Pair(int i, int j) {
		this.i = i;
		this.j = j;
	}
}

public class ConnectedGroups {

	public static void main(String[] args) {
		
		int n = new Random().nextInt(18);
		System.out.println(n);
		
		Set<Pair> set = new HashSet<Pair>();
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				Pair pair = new Pair(i, j);
				if(i == j) {
					int val = 1;
					arr[i][j] = val;
					set.add(pair);
				}
				else if(!set.contains(pair)) {
					int val = new Random().nextInt(2);
					arr[i][j] = val;
					arr[j][i] = val;
					set.add(pair);
				}
			}
		}
		
		System.out.print("[");
		for(int i = 0; i < n; i++) {
			System.out.print("[");
			for(int j = 0; j < n; j++) {
				if(j == n - 1) System.out.print(arr[i][j]);
				else System.out.print(arr[i][j] + ", ");
			}
			if(i == n - 1) System.out.print("]");
			else System.out.print("], ");
		}
		
		System.out.print("]");

	}

}
