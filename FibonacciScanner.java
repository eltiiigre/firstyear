// Ella Rose B. Cabalatungan
// CC 11-CC
// July 20, 2018

//Fibonacci
//Displays Fibonacci numbers depending on the input

import java.util.Scanner;

public class Fibonacci{
    public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println ("How many sequence?");
	    int n= sc.nextInt(); //inputs
		int a= -1;   //initial value of a
		int b= 1;    //initial value of b
		
		
		while (n!=0){
		int x= a+b;
		System.out.println (x);
		a=b;
		b=x;
		n=n-1;
		}
		System.out.println ("Fibonacci Series Displayed");
		
		
		
	}
}