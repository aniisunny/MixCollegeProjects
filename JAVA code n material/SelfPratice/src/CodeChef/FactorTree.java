package CodeChef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class FactorTree {

	static long numberOfFactors;
	static HashMap<Integer, List> map;
	static HashMap<Integer, Integer> total;
	static int modulus = 1000000007;
	
	private static void factors(HashMap<Integer, Integer> total, int key) {
	
		if(map.containsKey(key)) {
			List<Integer> l = map.get(key);
			for(int i = 0; i < l.size(); i++) {
				int t = l.get(i);
				if(total.containsKey(t)) {
					total.put(t, (total.get(t) + 1) % modulus);
				}
				else total.put(t, 1);
			}
		}
	}
	
	private static void helper(Stack<Integer> stack) {
		
		numberOfFactors = 1;
		total = new HashMap<Integer, Integer>();
		while(!stack.isEmpty()) {
			int key = stack.pop();
			factors(total, key);
		}
		
		for(long count : total.values()) {
			numberOfFactors = (numberOfFactors * (count + 1)) % modulus;
		}
	}
	
	private static void dfs(Stack<Integer> stack, int[][] edges, int n, int v, boolean[] visited) {
		
		int top = stack.peek();
		if(top == v) {
			helper(stack);
			return;
		}
		int i = 0;
		for(; i < n; i++) {
			int t = edges[i][1];
			if(visited[t] == false && top == edges[i][0]) {
				stack.add(t);
				visited[t] = true;
				dfs(stack, edges, n, v, visited);
				if(stack.isEmpty()) return;
			}
		}
		if(i == n) {
			stack.pop();
			return;
		}
	}
	
	private static void factorCalculate(List<Integer> list, int n) {
		
		int i = 2;
		while(i * i <= n) {
			if(n % i == 0) {
				list.add(i);
				n /= i;
			}
			else ++i;
		}
		
		if(n > 1) {
			list.add(n);
		}
	}

	public static void main(String[] args) throws Exception {
		
		try(BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
			String val[];
			val = read.readLine().split(" ");
			int testCases = Integer.valueOf(val[0]);
			while(testCases-- != 0) {
				val = read.readLine().split(" ");
				int n = Integer.valueOf(val[0]);
				int[][] edges = new int[2 * (n - 1)][2];
				for(int i = 0; i < edges.length; i++) {
					val = read.readLine().split(" ");
					int u = Integer.valueOf(val[0]);
					int v = Integer.valueOf(val[1]);
					edges[i][0] = u;
					edges[i][1] = v;
					++i;
					edges[i][0] = v;
					edges[i][1] = u;
				}
				
				map = new HashMap<Integer, List>();
				val = read.readLine().split(" ");
				for(int i = 1; i <= n; i++) {
					int x = Integer.valueOf(val[i - 1]);
					List<Integer> list = new ArrayList<Integer>();
					factorCalculate(list, x);
					map.put(i, list);
					
				}
				val = read.readLine().split(" ");
				int queries = Integer.valueOf(val[0]);
				while(queries-- != 0) {
					val = read.readLine().split(" ");
					int u = Integer.valueOf(val[0]);
					int v = Integer.valueOf(val[1]);
					Stack<Integer> stack = new Stack<Integer>();
					stack.add(u);
					boolean[] visited = new boolean[n + 1];
					visited[u] = true;
					dfs(stack, edges, edges.length, v, visited);
					System.out.println(numberOfFactors % modulus);
				}
			}
		}

	}

}
 