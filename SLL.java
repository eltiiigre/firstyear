
import java.util.Scanner;

public class SLL {	
	public static void main(String[] args){
	
	LinkedList List = new LinkedList();
	
	Scanner scan = new Scanner(System.in);
	int choice = 1;
	
	while(choice != 0){
		
		printMenu();
		System.out.print("Choice: ");
		choice = scan.nextInt();
		boolean check = true;

		switch(choice){
			case 1:	System.out.print("Input number to add to head: ");
					List.addToHead(scan.nextInt());
					pressEnter();
					break;
					
			case 2: System.out.print("Input number to add to tail: ");
					if(List.isEmpty() == true)
						List.addToHead(scan.nextInt());
					else
						List.addToTail(scan.nextInt());
					pressEnter();
					break;
					
			case 3: List.deleteFromHead();
					pressEnter();
					break;
					
			case 4: List.deleteFromTail();
					pressEnter();
					break;
					
			case 5: System.out.print("Input number to find in list: ");
					List.isInList(scan.nextInt());
					pressEnter();
					break;
					
			case 6: System.out.print("Input number to delete from the list: ");
					List.delete(scan.nextInt());
					pressEnter();
					break;
					
			case 7: if(List.isEmpty() == true)
						System.out.println("List is empty.");
					else
						List.printAll();
					pressEnter();
					break;
			
			}		
		}	
	}
	
	public static void printMenu(){

		System.out.println("\n0 - Exit");
		System.out.println("1 - Add to Head");
		System.out.println("2 - Add to Tail");
		System.out.println("3 - Delete from Head");
		System.out.println("4 - Delete from Tail");
		System.out.println("5 - Is in List");
		System.out.println("6 - Delete a Value");
		System.out.println("7 - Print all\n\n");				
	}
	
	private static void pressEnter() { 
        System.out.println("\nPress Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
	}
}

class Node {

	public int info;
	public Node next;
	
	Node() {
		info = 0;
		next = null;
	}
}

class LinkedList {
	
	public Node headNode;

	LinkedList() {
		
		headNode = null;

	}
	
	public boolean isEmpty(){
		return (headNode == null);
	}
	
	
	public void addToHead(int i){
		
		Node newNode = new Node();
		newNode.info = i;
		newNode.next = headNode;
		headNode = newNode;
		
		System.out.println(i+ " succesfully added to head.");
		
	}
	

	public void addToTail(int i){
		
		Node newNode = new Node();
		newNode.info = i;
		
		Node currentNode = headNode;
		
		while(currentNode.next != null){
			currentNode = currentNode.next;
		}
		
		currentNode.next = newNode;
	
		System.out.print(i+ " succesfully added to tail.");
		
	}
	
	
	public void deleteFromHead(){
		
		if(headNode == null){
			System.out.print("List is Empty");
		}
		
		else {
			Node temp = headNode;
			headNode = headNode.next;
			temp.next = null;
			
			System.out.println("Succesfully deleted from head.");
		}				
	}
	
	public void deleteFromTail(){
			
		//empty list
		if(headNode == null){
			
			System.out.print("List is Empty");
			return;
			
		}
		
		//1 element
		else if(headNode.next == null){
			
			headNode = null;
			
		}
		
		else {
			
			Node lastNode = headNode;
			Node previousNode = null;
				
				while(lastNode.next != null){
					previousNode = lastNode;
					lastNode = lastNode.next;
				}
				previousNode.next = null;
		}
		
		System.out.println("Succesfully deleted from tail.");
	}
		
	
	public void isInList(int i){		
		
		Node currentNode = headNode;
		
		while(currentNode != null){
			if (currentNode.info == i){
				
				System.out.print("Number is IN the list");
				break;
			}
			else
				currentNode = currentNode.next;
		}
		
		if (currentNode == null)
			System.out.print("Number is NOT in the list");
	}	
	
	
	public void delete(int i){
				
		Node currentNode = headNode;
		Node temp = null;
		
		if (currentNode != null && currentNode.info == i){
			headNode = currentNode.next;
			return;
		}
		
		while (currentNode != null && currentNode.info != i){
			temp = currentNode;
			currentNode = currentNode.next;
		}
		
		if (currentNode == null){
			return;
		}
		
		temp.next = currentNode.next;
	}
		
	
	public void printAll(){
		
		Node node = headNode;
		
		while(node != null){
			System.out.print("  " + node.info +"  ");
			node = node.next;
		}
	}
}