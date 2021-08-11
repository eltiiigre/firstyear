/*Ella Rose B. Cabalatungan
*CC12-CCB
*January 12, 2019
*Parentheses Checker
*Re-implement stack to using arrays.
*/
import java.util.Scanner;

public class ParenthesesChecker{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		Stack stack = new Stack();
		
		int testcases = scan.nextInt();	//user inputs number of testcase/s
		scan.nextLine();

		boolean matched = true;
		boolean testcase[] = new boolean[testcases];
		
		for(int i = 0; i < testcases; i++){
			System.out.println();
			String data = scan.nextLine();	//user inputs elements to be checked
			
			for( int j = 0; j < data.length(); j++){
				if(data.charAt(j) == '('){
					
				stack.push(data.charAt(j));	//adds element to the stack
					
				}	
				if(data.charAt(j) == ')'){
					if(!stack.isEmpty()) {	
						stack.pop();	//retrieves element from stack
						
					} else {
						matched = false;
						break;
					}
				}
				if(!stack.isEmpty()){	//checks whether the stack is empty or not
					matched = false;
				} else
					matched = true;
			}
			
			testcase[i] = matched;	
			stack.clear();
		}
		
		
		for(int i = 0; i < testcases; i++){
		
			if(testcase[i]){
				System.out.println("Case # " + (i+1) + ": properly matched.");
			} else {
				System.out.println("Case # " + (i+1) + ": not properly matched.");
			}
			
		}
		
	}
	
}