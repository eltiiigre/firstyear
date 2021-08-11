import java.util.*;

public class Array{
	
	public static void main(String[] args){
		
	Scanner console = new Scanner(System.in);
	
	System.out.println("Input size of an Array");
	int size = console.nextInt();
	int array[] = new int [size];
	int choice, input;
 	boolean flag = true;
	boolean found = false;
		while(flag){
 			printMenu();
		    choice = console.nextInt();
			
			switch(choice) {
 				
				case 0:
 					flag = false;
 					break;
				
				case 1://search
					System.out.print("Enter a value to search: ");
					input = console.nextInt();
					for (int i = 0; i < size; i++){
						if (array[i]==input){
							found = true;
						}else
							found = false;
					}
						if(found==true){
							System.out.println(input + " is in the list.");
						}
						else
							System.out.println(input + " is not in the list.");
						
						pause();
						break;
					
				case 2://insert 
					int nextAvailable = 0;
					found = false;
					int i, j;

						while (nextAvailable < size){
							int insertionPoint = nextAvailable;
							//insert value
							System.out.println("Enter a value you want to insert: ");
							input=console.nextInt();
							//search for insertion point
								for ( i = 0; i<size; i++){
									if(array[i]>input){
										found = true;
										insertionPoint = i;
									}
								}
							//insertion of the new value
									if (found==false){
										array[insertionPoint]=input;	
									}
									else{
									//Shift to the right
										for ( i = nextAvailable; i>insertionPoint; i--){
											array[i] = array[i-1];
										}
									array[insertionPoint]=input;
									}
						nextAvailable++;
						printArray(array,size);
						}
						
						pause();
						break;
				
				case 3://delete
					System.out.print("Enter a value you want to delete");
					input=console.nextInt();
					boolean inList= false;
					for ( i = 0; i<size; i++){
						if(array[i]==input){
							for ( j = i; j < size-1; j++){
							array[j]=array[j+1];
							}
							
							inList=true;
						}
					}
						if (inList==true){
							System.out.println(input + " deleted successfully!!");
						}
						else{
							System.out.println(input + " is not in the list.");
						}
						printArray(array,size-1);
						pause();
						break;
					default:
					System.out.println("Enter a valid choice.");
                    pause();
					break;
					
				}	
			}
			
		}
	
	public static void printMenu(){
		System.out.println("0 - EXIT");
		System.out.println("1 - SEARCH");
		System.out.println("2 - INSERT");
		System.out.println("3 - DELETE");
		System.out.println();
		System.out.print("Choice: ");
	}
	
	public static void printArray(int array[],int size){
		for (int i = 0; i<size; i++){
			System.out.print(array[i] + " ");
			}
			System.out.print("\n");
	}
		
	public static void pause(){
		Scanner input = new Scanner(System.in);
		System.out.println("\nPress enter to continue . . .");
		String Continue = input.nextLine();
	}
		
}