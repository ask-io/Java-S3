package module1.lab;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum limit: ");
        int limit = sc.nextInt();
        int a = 0, b = 1;
        
        System.out.print("Fibonacci series: " + a);
        while (b <= limit) {
            System.out.print(" " + b);
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
        
        sc.close();
    }
}