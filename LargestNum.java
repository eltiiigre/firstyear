import java.util.*;

public class LargestNum {
		//this program read input number and find the larger value
	public static void main(String[] args) {
		//keyboard scan, prompt user to enter numbers
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
	do {
		try {
		System.out.println("Please enter two numbers");
		double num1  =input.nextDouble();
		double num2  =input.nextDouble();
		double max =0;
		if (num1>num2)
			max =num1;
		else
			max =num2;
		System.out.println("The largest value is" + max);
		
		continueInput = false;
			}
	catch (InputMismatchException ex) {
		System.out.println("Try gain (" + "Incorrect input: an integer is required)");
		input.nextLine();
		 }
		} while (continueInput);
	}
}