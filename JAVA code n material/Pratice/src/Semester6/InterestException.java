package Semester6;

public class InterestException extends ArithmeticException {

	
	private static final long serialVersionUID = 1L;
	
	InterestException() {
		super("Invalid input");
	}
	
	InterestException(String m) {
		super("Invalid " + m + ". Please enter correct values.");
	}
}
