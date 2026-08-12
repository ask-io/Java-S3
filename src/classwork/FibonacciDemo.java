package classwork;
import java.util.Scanner;

class Fibonacci {
	int n3 = 0, n2 = 1, n1 = 0;
	void fib(int n){
		if(n>0) {
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			fib(n-1);
		}
	}
}

public class FibonacciDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fibonacci f = new Fibonacci();
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        f.fib(n);
        sc.close();

	}

}
