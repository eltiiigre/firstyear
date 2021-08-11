import java.util.Scanner;
class OddEven {
	public static void main(String[] Args) {
		int num;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number: ");
		for(num=1;num<=10;num++){
			int x=input.nextInt();
			if ((x%2)==0){
				System.out.println(x+ "is even.");
			}
			else{
				System.out.println(x+ "is odd");
			}
		}
	}
}