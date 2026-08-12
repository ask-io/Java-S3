package module1.tutorial3;
import java.util.Scanner;

public class Question5 {

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
	    for(int i = 0; i < n; i++) {
	    	System.out.print("Enter value " + (i + 1) + ": ");
	    	arr[i] = sc.nextInt();
	    }
	    
	    int max = arr[0];
	    int min = arr[0];
	    
	    for(int i = 1; i < n; i++) {
	        if(arr[i] > max) {
	            max = arr[i];
	        }
	        if(arr[i] < min) {
	            min = arr[i];
	        }
	    }
	    
	    System.out.println("Maximum value: " + max);
	    System.out.println("Minimum value: " + min);
        
        sc.close();
	}
}