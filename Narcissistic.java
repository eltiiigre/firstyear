/*Ella Rose B. Cabalatungan, Maria Liza Paano
*CC12-CCB
*November 19, 2018
*Narcissistic
*Create a program that identifies whether an input integer is a narcissistic number or not.
*/
import java.util.ArrayList;
import java.util.*;

public class Narcissistic {
	public static void main(String[] args){
		
		Scanner console = new Scanner(System.in);
		System.out.println("Enter an Input");
		ArrayList<Integer> InputArray = new ArrayList<Integer>();
		ArrayList<Integer> InputArray2 = new ArrayList<Integer>();
		int input = console.nextInt();
		int z=input;
		int ctr=0;
		int prod=1;
		int sum=0;
		boolean y=false;
		Double result = new Double(0.0);
	
		
		//create user- defined array
		while(z > 0){
			int digit = z%10;
			z=z/10;
			InputArray.add(digit);
			ctr++;
		}
		
		//raise each digit to the power of total # of digits
		int index= 0;
		while(InputArray.size()>index){
			int x = InputArray.get(index);
			if(x>=0){
				result = Math.pow(x, ctr);
				int i = result.intValue();
				InputArray2.add(i);
		//get the sum of all the elements in your array	
				sum=sum+i;
				index++;}
		}     //System.out.println(sum);
		
	
		//classify if narcissistic or not
			if (sum==input){
				System.out.println(input+" is a Narcissistic Number.");
			}else{
				System.out.println(input+" is not a Narcissistic Number.");
			}
	}
}
