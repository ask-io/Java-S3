package module1.tutorial3;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    
	    for(int i = 0; i < n; i++) {
	    	System.out.print("Enter value " + (i + 1) + ": ");
	    	arr[i] = sc.nextInt();
	    }
	    
	    int evenCount = 0;
	    int oddCount = 0;
	    
	    for(int i = 0; i < n; i++) {
	        if(arr[i] % 2 == 0) {
	            evenCount++;
	        } else {
	            oddCount++;
	        }
	    }
	    
	    System.out.println("Number of even elements: " + evenCount);
	    System.out.println("Number of odd elements: " + oddCount);
	    
	    sc.close();
	}
}