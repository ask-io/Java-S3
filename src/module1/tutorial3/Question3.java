package module1.tutorial3;
import java.util.Scanner;
import java.util.Arrays;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    
	    for(int i = 0; i < n; i++) {
	    	System.out.print("Enter value " + (i + 1) + ": ");
	    	arr[i] = sc.nextInt();
	    }
	    
	    Arrays.sort(arr);
	    
	    System.out.print("Array in ascending order: ");
	    for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        sc.close();
	}
}