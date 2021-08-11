import java.util.Scanner;

public class MatchingParentheses{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		Stack stack = new Stack();
		
		int testcases = scan.nextInt();
		scan.nextLine();

		boolean matched = true;
		boolean testcase[] = new boolean[testcases];
		
		for(int i = 0; i < testcases; i++){
			
			System.out.println();
			String data = scan.nextLine();
			
			
		
			for( int j = 0; j < data.length(); j++){
				
				
				if(data.charAt(j) == '('){
					
					stack.push(data.charAt(j));
					
				}
				
				
				if(data.charAt(j) == ')'){
					
					if(!stack.isEmpty()) {
						
						stack.pop();
						
					} else {
						matched = false;
						break;
					}
				}

				if(!stack.isEmpty()){
					matched = false;
				} else
					matched = true;
			}
			
			testcase[i] = matched;					
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