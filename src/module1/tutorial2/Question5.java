package module1.tutorial2;
import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a value: ");
		int n = sc.nextInt();
		int n1 = 0, n2 = 1, n3;
		System.out.print(n1+" "+n2+" ");
		for(int i=0; i<n-2; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(+n3+" ");
		}
		sc.close();
	}
}
