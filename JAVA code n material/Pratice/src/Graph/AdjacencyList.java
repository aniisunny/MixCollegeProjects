package Graph;

import java.util.Scanner;

class ListNode {
	
	int vertexNumber;
	ListNode next;
	
}

public class AdjacencyList {
	
	int vertices;
	int edges;
	ListNode [] adjacency;
	
	static AdjacencyList adjacencyListOfGraph () {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner ( System.in );
		
		int u, v, i;
		
		AdjacencyList adjacencyList = new AdjacencyList ();
		
		System.out.print ( "Enter the number of vertices :- " );
		adjacencyList.vertices = scan.nextInt ();
		
		System.out.print ( "Enter the number of edges :- " );
		adjacencyList.edges = scan.nextInt ();
		
		adjacencyList.adjacency = new ListNode [ adjacencyList.vertices ];
		
		for ( i = 0; i < adjacencyList.vertices; i++ ) {
			
			adjacencyList.adjacency [ i ].vertexNumber = i;
			adjacencyList.adjacency [ i ].next = adjacencyList.adjacency [ i ];
			
			
		}
		
		for ( i = 0; i < adjacencyList.edges; i++ ) {
			
			System.out.print ( "Enter the edge with source node and destination node :- " );
			u = scan.nextInt ();
			v = scan.nextInt ();
			
			ListNode ptr = new ListNode ();
			
			ptr.vertexNumber = v;
			ptr.next = adjacencyList.adjacency [ u ];
			
			ListNode temp = adjacencyList.adjacency [ u ];
			
			while ( temp.next != adjacencyList.adjacency [ u ] ) 
				temp = temp.next;
			
			temp.next = ptr;
			
		}
		
		return adjacencyList;
		
	}

	public static void main(String[] args) {
		
		AdjacencyList adjacencyList = adjacencyListOfGraph ();
		
		for ( int i = 0; i < adjacencyList.vertices; i++ ) {
			
			ListNode ptr = adjacencyList.adjacency [ i ];
			
			while ( ptr.next != adjacencyList.adjacency [ i ] ) {
				
				System.out.print ( ptr.vertexNumber + "->" );
				ptr = ptr.next;
				
			}
			
			System.out.println ();
			
		}
		
	}
	
}
