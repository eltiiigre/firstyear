// Show the first 50 Compposite Numbers
public class CompositeNumber { 
public static void main(String[] args) {

    int n;
    int status = 1;
    int num = 1;
    int count = 0;

	n = 50;
    System.out.println("The first " + n + " composite numbers are:");
	
    for (int i = 1; i <= n;) {
		
        for (int j = 2; j <= Math.sqrt(num); j++) {
			
            if (num % j == 0) {
                status = 0;
                break;
            }
			
        }
        if (status == 0 && num<=50) {
            
			System.out.print(num + " ");
            i++;
            count++;
        }
        status = 1;
        num++;

        if (count == 5) {
            System.out.println();
            count = 0;
        }
    }
}
}