package classwork;
import java.util.Scanner;

class Factorial {
    int fact(int n) {
 
        if (n <= 1) {
            return 1;
        }
        int result = n * fact(n - 1);
        return result;
    }
}

public class FactorialDemo {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        Factorial f = new Factorial();
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int result = f.fact(number);
        
        System.out.println("Factorial of " + number + " is: " + result);
        sc.close();
    }
}
