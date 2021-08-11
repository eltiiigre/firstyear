//Ella Rose B. Cabalatungan
//CC11 CCC
//July 20 2018

//Multiplication Table
//Displays the multiplication table of the input

import java.util.Scanner; //scanner


public class MultiplicationTableScanner{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); //calls the scanner to the main method
		//input
		System.out.println("Input:");
		int n = sc.nextInt();
		
		//counter 
		int ctr = 0;
		
		//loop
		while (ctr!=10){
			ctr++;
			int prod = n*ctr;
			System.out.println(ctr+"x"+n+"="+prod);
			
			
		}
	
	}
}