package Graph;

import java.util.Scanner;

public class AdjacendyMatrix {
	
	int vertices;
	int edges;
	int [] [] adjacency;
	
	static AdjacendyMatrix adjacencyMatrixOfGraph () {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner ( System.in );
		
		int u, v, i;
		
		AdjacendyMatrix adjacencyMatrix = new AdjacendyMatrix ();
		
		System.out.print ( "Enter the number of vertices :- " );
		adjacencyMatrix.vertices = scan.nextInt ();
		
		System.out.print ( "Enter the number of edges :- " );
		adjacencyMatrix.edges = scan.nextInt ();
		
		adjacencyMatrix.adjacency = new int [ adjacencyMatrix.vertices ] [ adjacencyMatrix.vertices ];
		
		for ( u = 0; u < adjacencyMatrix.vertices; u++ )
			
			for ( v = 0; v < adjacencyMatrix.vertices; v++ )
				
				adjacencyMatrix.adjacency [ u ] [ v ] = 0;
		
		System.out.println();
		System.out.print ( "Enter the node numbers in a pair that connects an edge" );
		
		for ( i = 0; i < adjacencyMatrix.edges ; i++ ) {
			
			u = scan.nextInt ();
			v = scan.nextInt ();
			
			adjacencyMatrix.adjacency [ u ] [ v ] = 1;
			adjacencyMatrix.adjacency [ v ] [ u ] = 1;
			
		}
		
		System.out.println ();
		
		return adjacencyMatrix;
		
	}

	public static void main(String[] args) {
		
		AdjacendyMatrix adjacencyMatrix = adjacencyMatrixOfGraph ();
		
		System.out.println ( "Representation of Adjacency Matrix of graph :- ");
		
		for ( int var [] : adjacencyMatrix.adjacency ) {
			
			for ( int temp : var )
				
				System.out.print ( " " + temp + " " );
			
			System.out.println (); 
			
		}

	}

}
