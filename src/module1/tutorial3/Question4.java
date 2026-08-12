package module1.tutorial3;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    
	    for(int i = 0; i < n; i++) {
	    	System.out.print("Enter value " + (i + 1) + ": ");
	    	arr[i] = sc.nextInt();
	    }
	    
	    System.out.print("Enter the number to search: ");
	    int target = sc.nextInt();
	    int position = -1;
	    
	    for(int i = 0; i < n; i++) {
	        if(arr[i] == target) {
	            position = i + 1;
	            break;
	        }
	    }
	    
	    if(position != -1) {
	        System.out.println("Number found at position: " + position);
	    } else {
	        System.out.println("Number not found in the array.");
	    }
        
        sc.close();
	}
}