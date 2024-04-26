package Graph;

import java.util.Scanner;

public class FloydWarshell {
	
	int vertices;
	int edges;
	int [] [] adjacency;
	
	static FloydWarshell adjacencyMatrixOfGraph () {
		
		Scanner scan = new Scanner ( System.in );
		
		int u, v, i, weight;
		
		FloydWarshell floydWarshell = new FloydWarshell ();
		
		System.out.print ( "Enter the number of vertices :- " );
		floydWarshell.vertices = scan.nextInt ();
		
		System.out.print ( "Enter the number of edges :- " );
		floydWarshell.edges = scan.nextInt ();
		
		floydWarshell.adjacency = new int [ floydWarshell.vertices ] [ floydWarshell.vertices ];
		
		for ( u = 0; u < floydWarshell.vertices; u++ )
			
			for ( v = 0; v < floydWarshell.vertices; v++ )
				
				floydWarshell.adjacency [ u ] [ v ] = 0;
		
		System.out.println();
		
		for ( i = 0; i < floydWarshell.edges ; i++ ) {
			
			System.out.print ( "Enter the node numbers in a pair that connects an edge :- " );
			u = scan.nextInt ();
			v = scan.nextInt ();
			
			System.out.print ( "Enter the edge weight or cost :- " );
			weight = scan.nextInt ();
			
			floydWarshell.adjacency [ u ] [ v ] = weight;
			
			System.out.println ();
			
		}
		
		System.out.println ();
		
		for ( i = 0; i < floydWarshell.vertices; i++ )
			
			for ( u = 0; u < floydWarshell.vertices; u++ )
				
				for ( v = 0; v < floydWarshell.vertices; v++ ) {
					
					if ( floydWarshell.adjacency [ u ] [ i ] + floydWarshell.adjacency [ i ] [ v ] < floydWarshell.adjacency [ u ] [ v ] )
						
						floydWarshell.adjacency [ u ] [ v ] = floydWarshell.adjacency [ u ] [ i ] + floydWarshell.adjacency [ i ] [ v ];
					
				}
		
		return floydWarshell;
		
	}

	public static void main(String[] args) {
		
		FloydWarshell floydWarshell = adjacencyMatrixOfGraph ();
		
		System.out.println ( "Representation of Adjacency Matrix of graph :- ");
		
		for ( int var [] : floydWarshell.adjacency ) {
			
			for ( int temp : var )
				
				System.out.print ( " " + temp + " " );
			
			System.out.println (); 
			
		}

	}

}
