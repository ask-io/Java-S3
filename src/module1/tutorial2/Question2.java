/*
 * Author: Abhijit Smiju Kunnel
 * Reg No: 25CS005
 * Roll No: 02
 * 
 * Question 2: Take n as input and print odd numbers from 1 to n using a for loop and continue statement
 */
package module1.tutorial2;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		for(int i = 0; i<n+1; i++) {
			if(i%2 != 0) {
				System.out.print(i+" ");

			}
			else {
				continue;
			}
		}
		sc.close();
	}

}
