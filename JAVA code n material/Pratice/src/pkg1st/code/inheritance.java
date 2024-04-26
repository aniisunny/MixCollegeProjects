package pkg1st.code;

class Bicycle 
{
    int gear=5;
    int speed=20;
    void display() {
    	System.out.println("Gear of bicycle is " +gear);
    	System.out.println("Speed of bicycle is " +speed);
    }
}
class MountainBike extends Bicycle 
{
    int seatheight=55;
    void output() {
    	System.out.println("Seatheight of bicycle is " +seatheight);
    }
}
public class inheritance {

	 public static void main(String args[]) 
	    {
	        MountainBike mb = new MountainBike();
	        mb.display();
	        mb.output();
	    }
}