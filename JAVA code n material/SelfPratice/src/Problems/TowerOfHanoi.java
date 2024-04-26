package Problems;

public class TowerOfHanoi {
	
	static void towerOfHanoi ( int n, char sourcePole, char auxiliaryPole, char destinationPole) {
		
		if ( n == 0 )
			return;
		
		towerOfHanoi ( n - 1, sourcePole, destinationPole, auxiliaryPole );
		
		System.out.println ( "Move the disk " + n + " from " + sourcePole + " to " + destinationPole );
		//System.out.printf ( "Move the disk %d from %c to %c\n", n, sourcePole, destinationPole ); 
		
		towerOfHanoi (n - 1, auxiliaryPole, sourcePole, destinationPole );
		
	}

	public static void main(String[] args) {
		
		towerOfHanoi ( 5, 'S', 'A', 'D');
		
	}

}
