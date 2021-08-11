/*Ella Rose B. Cabalatungan
*CC13-CCB
*November 21, 2018
*Multi-dimensional Arrays 
*Create a program that  takes two user-defined matrices from the user and will solve for their product, if the product is defined. 
*/
import java.util.*;
public class MultidimensionalArrays{
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		//Input the number of rows and columns for Matrix A
			int rA = input.nextInt();
			int cA = input.nextInt(); 
			int[][] MatrixA = new int [rA][cA]; 
			int sum = 0;	
		//Input elements for Matrix A 
		for (int i =0; i<rA; i++){
			for(int j=0; j<cA; j++){
				MatrixA[i][j] = input.nextInt();
			}
		}
		//Input the number of rows and columns for Matrix B
			int rB = input.nextInt();
			int cB = input.nextInt();
		
		if (cA != rB )	//In order to have a definite product
			System.out.println("The matrices can't be multiplied with each other.");
		else{ 
			int[][] MatrixB = new int [rB][cB];
			int product[][] = new int[rA][cB];
		 
		 //Input elements for Matrix B
		for (int i = 0; i < rB; i++)
            for (int j = 0; j < cB; j++)
               MatrixB[i][j] = input.nextInt();
		 
		 for (int i = 0; i < rA; i++){
            for (int j = 0; j < cB; j++){  
               for (int k = 0; k < rB; k++){
                  sum = sum + MatrixA[i][k]*MatrixB[k][j];
               }
               product[i][j] = sum;
               sum = 0;
            }
         }
		  for (int i = 0; i < rA; i++)
         {
            for (int j = 0; j < cB; j++)
               System.out.print(product[i][j]+"\t");
 
            System.out.print("\n");
         }
		   
		}
		
	}
}