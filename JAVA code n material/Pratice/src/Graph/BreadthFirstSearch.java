package Graph;

import java.util.Scanner;

public class BreadthFirstSearch {
	
	int vertices;
	int edges;
	int [][] adjacency;
	Queue front = null;
	Queue rear = null;
	
	class Queue {
		
		int data;
		Queue next;
		
	}
	
	void adjacencyMatrixOfGraph () {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner ( System.in );
		
		int u, v, i;
		
		System.out.print ( "Enter the number of vertices :- " );
		vertices = scan.nextInt ();
		
		System.out.print ( "Enter the number of edges :- " );
		edges = scan.nextInt ();
		
		adjacency = new int [ vertices ] [ vertices ];
		
		for ( u = 0; u < vertices; u++ )
			
			for ( v = 0; v < vertices; v++ )
				
				adjacency [ u ] [ v ] = 0;
		
		System.out.println();
		System.out.print ( "Enter the node numbers in a pair that connects an edge" );
		
		for ( i = 0; i < edges ; i++ ) {
			
			u = scan.nextInt ();
			v = scan.nextInt ();
			
			adjacency [ u ] [ v ] = 1;
			adjacency [ v ] [ u ] = 1;
			
		}
		
		System.out.println ();
		
		System.out.println ( "Representation of Adjacency Matrix of graph :- ");
		
		for ( int var [] : adjacency ) {
			
			for ( int temp : var )
				
				System.out.print ( " " + temp + " " );
			
			System.out.println (); 
			
		}
		
		System.out.println ();
		
	}
	
	 void BFS () {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner ( System.in );
		int i, n, j = 0;
		int visited [] = new int [ vertices ];
		
		System.out.print ( "Enter the node number which to be start for traversing :- " );
		int nodeNumber = scan.nextInt ();
		
		Queue ptr = new Queue ();
		
		ptr.data = nodeNumber;
		
		if ( rear == null )
        	front = rear = ptr;
		
		while ( front != null ) {
			
			
			System.out.print ( "Enter the total number of adjacent nodes of " + front.data + " :- " );
			n = scan.nextInt ();
			
			visited [ j ] = front.data;
			front = front.next;
			
			for ( i = 0; i < n; i++ ) {
				
				System.out.print ( "Enter the adjacent node number :- " );
				nodeNumber = scan.nextInt ();
				
				ptr = new Queue ();
				
				ptr.data = nodeNumber;
				
				if ( front == null )
					front = rear = ptr;
				
				else {
					
					rear.next = ptr;
					rear = ptr;
					
				}
				
			}
			
			j++;
			
		}
		
		System.out.println ();
		
		System.out.print ( "Traversing Order of Graph :- " );
		
		for ( j = 0; j < vertices; j ++ ) 
			System.out.print ( visited [ j ] + " " );
		
	}

	public static void main ( String[] args ) {
		
		BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch ();
		breadthFirstSearch.adjacencyMatrixOfGraph ();
		breadthFirstSearch.BFS();

	}

}
