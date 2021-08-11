import java.util.*;

public class LCM {
 public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.println("Enter two numbers");

	int num1, num2, lcm;
	num1 = input.nextInt();
	num2 = input.nextInt();

	lcm = (num1>num2) ? num1 : num2;

	while(true){
		if(lcm % num1 == 0 && lcm % num2 == 0){
			System.out.printf("The LCM %d and %d is %d", num1, num2, lcm);
			break;
	}
	lcm++;
  }
 }
}