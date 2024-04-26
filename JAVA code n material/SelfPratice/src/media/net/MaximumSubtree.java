package media.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaximumSubtree {
	
	static int maxSize;
	static int[] parent;
	static int[] size;
	
	public static int findRoot (int a) {
		
		return a == parent[a] ? a : findRoot (parent[a]);
	}
	
	public static void join (int a, int b) {
		
		int root1 = findRoot (a);
		int root2 = findRoot (b);
		
		if (size[root1] < size[root2]) {
			int temp = root1;
			root1 = root2;
			root2 = temp;
		}
		
		parent[root2] = root1;
		size[root1] += size[root2];
		maxSize = Math.max (maxSize, size[root1]);
	}
	
	public static int[] solve (int nodes, int[] start, int[] end, int[] delete) {
		
		maxSize = 0;
		parent = new int[nodes + 1];
		size = new int[nodes + 1];
		boolean[] visited = new boolean[start.length];
		int[] ans = new int[delete.length];
		
		for (int i = 1; i <= nodes; i++) {
			parent[i] = i;
			size[i] = 1;
		}
		
		for (int i = 0; i < delete.length; i++) {
			visited[delete[i] - 1] = true;
		}
		
		for (int i = 0; i < start.length; i++) {
			if (!visited[i]) {
				join (start[i], end[i]);
			}
		}
		
		for (int i = delete.length - 1; i >= 0; i--) {
			ans[i] = maxSize;
			join (start[delete[i] - 1], end[delete[i] - 1]);
		}
		
		return ans;
	}

	public static void main(String[] args) throws IOException {
		
		try (BufferedReader read = new BufferedReader (new InputStreamReader (System.in))) {
			
			int nodes = Integer.parseInt (read.readLine ());
			
			String[] s = read.readLine ().split (" ");
			int[] start = new int[s.length];
			
			for (int i = 0; i < start.length; i++) {
				start[i] = Integer.valueOf (s[i]);
			}
			
			s = read.readLine ().split (" ");
			int[] end = new int[s.length];
			
			for (int i = 0; i < end.length; i++) {
				end[i] = Integer.valueOf (s[i]);
			}
			
			s = read.readLine ().split (" ");
			int[] delete = new int[s.length];
			
			for (int i = 0; i < delete.length; i++) {
				delete[i] = Integer.valueOf (s[i]);
			}
			
			System.out.println (Arrays.toString (solve (nodes, start, end, delete)));
		}
	}

}

// testcase1
//5
//1 3 3 5
//3 2 4 1
//1 3
//[3,2]

// testcase2
//15
//3 1 11 9 15 13 8 8 3 1 15 1 1 1 
//7 14 1 5 4 9 12 9 10 3 9 2 6 9
//1 3 14 2 7 4
//[14, 13, 7, 7, 6, 5]
