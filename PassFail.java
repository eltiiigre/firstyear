import java.util.*;

public class PassFail {
		//this program computes average grades with four inputs
	public static void main(String[] args) {
		//keyboard scan, prompts user to enter grade
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
	do {
		try {
		System.out.println("Please enter four grades");
		double m1  =input.nextDouble();
		double m2  =input.nextDouble();
		double m3  =input.nextDouble();
		double m4  =input.nextDouble();
		double grade=(m1+m2+m3+m4)/4; 
		
		System.out.println("Your average Grade is ="+grade);
	
		if (grade>50)
			System.out.println("Good job you Passed"); 
		else
			System.out.println("Sorry you Failed");
		
		continueInput = false;
			}
	catch (InputMismatchException ex) {
		System.out.println("Try gain (" + "Incorrect grade input/s: an integer is required)");
		input.nextLine();
		 }
		} while (continueInput);
	}
}
