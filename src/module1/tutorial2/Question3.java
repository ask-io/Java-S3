package module1.tutorial2;

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 4-digit number: ");
        int n = sc.nextInt();

        if (n < 1000 || n > 9999) {
            System.out.println("Please enter a valid 4-digit number.");
        } else {
            int sum = 0;

            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }

            System.out.println("Sum of digits: " + sum);
        }

        sc.close();
    }
}