package module1.lab;
import java.util.Scanner;

public class GCDCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int originalA = a, originalB = b;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD of " + originalA + " and " + originalB + " is: " + a);
        sc.close();
    }
}