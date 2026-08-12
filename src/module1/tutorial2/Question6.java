package module1.tutorial2;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value: ");
		int n = sc.nextInt();
		
		int forward = n;
		int backward = 0;
		
		while(n>0) {
			int end = n%10;
			backward = (backward*10)+end;
			n = n/10;
		}
		if(forward == backward) {
			System.out.println(forward + " is a palindrome.");
		}else {
			System.out.println(forward + " is NOT a palindrome.");
		}
		sc.close();
	}

}
