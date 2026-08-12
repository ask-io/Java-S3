package module1.tutorial3;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
	    int n = sc.nextInt();
	    
	    if (n <= 0) {
	        System.out.println("Invalid number of elements.");
	        sc.close();
	        return;
	    }
	    
	    int[] arr = new int[n];
	    double sum = 0;
	    
	    for(int i = 0; i < n; i++) {
	    	System.out.print("Enter value " + (i + 1) + ": ");
	    	arr[i] = sc.nextInt();
	    	sum += arr[i];
	    }
	    
	    double average = sum / n;
	    
	    System.out.println("Sum of elements: " + sum);
	    System.out.println("Average of elements: " + average);
        
        sc.close();
	}
}