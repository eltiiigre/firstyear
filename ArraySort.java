import java.util.*;
	
public class ArraySort{
	
	public static void main(String[] args){
		
	Scanner console = new Scanner(System.in);
	System.out.println("Input size of an Array:");
	int size = console.nextInt();
	int array[] = new int [size];
	int choice, input;
 	boolean flag = true;
	boolean found = false;
	//variables for insert
	input = 0;
	int nextAvailable = 0;
	int insertionPoint = nextAvailable;
		
		while(flag){
 			printMenu();
		    choice = console.nextInt();
			
			switch(choice) {
 				case 0:
						flag = false;
						break;
				case 1://Search
						System.out.print("Enter value to search: ");
						input = console.nextInt();
						for (int i = 0; i < size; i++){
							if (array[i] == input)
							found = true;
						}
						if(found == true){
							System.out.println(input + " is in the list.");
						}
						else{
							System.out.println(input + " is not in the list.");
						}
						pause();
						break;
				case 2://Insert 
						System.out.print("Enter value to insert: ");
						input = console.nextInt();
						while (nextAvailable < size) {
							for (int ctr = 0; ctr < size; ctr++){
								if (array[ctr] > input){
									found = true;
									insertionPoint = ctr;
								}
							}
						//insertion of the new element
						if (found == false){
							array[insertionPoint] = input;
						}
						else{
						//shift to the right
							for (int ctr = nextAvailable; ctr > insertionPoint; ctr--){
								array[ctr] = array [ctr-1];
							}
						}array [insertionPoint] = input;
						}
						System.out.println(input + " added successfully!");
						printArray (array, size);
						pause();
						break;
				case 3:
						System.out.print("Enter value you want to delete:");
						input=console.nextInt();
						boolean inList= false;
						for (int i = 0; i < size; i++){
							if(array[i] == input){
								for (int j = i; j < size-1; j++){
									array[j]=array[j+1];
								}
									inList=true;
							}
						}
						if (inList == true){
							System.out.println(input + " deleted successfully!!");
						}
						else{
							System.out.println(input + " is not in the list.");
						}
						
						printArray(array,size-1);
						pause();
						break;
				case 4:
						printArray (array, array.length);
				default:
						System.out.println("Enter a valid choice.");
						pause();
						break;
			}	
		}	
	}
	
	public static void printMenu(){
		
		System.out.println("\n MENU: \n");
		System.out.println("0 - Exit");
		System.out.println("1 - Search");
		System.out.println("2 - Insert");
		System.out.println("3 - Delete");
		System.out.println("4 - Print Array");
		System.out.println();
		System.out.print("Choice: ");
	}
	public static void printArray(int array[],int size){
		
		for (int i = 0; i<array.length; i++){
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