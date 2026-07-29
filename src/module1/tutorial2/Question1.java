/*
 * Author: Abhijit Smiju Kunnel
 * Reg No: 25CS005
 * Roll No: 02
 * 
 * Question 1: Input a character and use a switch statement to determine if it's a vowel or a consonant.
 */
package module1.tutorial2;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an Alphabet: ");
		char ch = sc.next().charAt(0);	//To take first character of string
		switch(Character.toLowerCase(ch)) {
		case 'a':case 'e':case 'i': case 'o':case 'u' : System.out.println(ch+" is a Vowel"); break;
		default : System.out.println(ch+" is NOT a Vowel");
		sc.close();
		}
	}

}
