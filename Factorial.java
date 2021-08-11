import java.util.*;

public class Factorial {
    public static void main(String[] args) {

	System.out.println("Enter a number");
	Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int factorial = 1;

        for(int i = 1; i <= num; ++i)
        {
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}