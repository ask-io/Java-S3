package module1.tutorial4;
import java.util.Scanner;

class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;


    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }


    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

class BankAccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Details:");
        System.out.print("Enter Account Number: ");
        String accNo = sc.next();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        BankAccount myAccount = new BankAccount(accNo, name, initialBalance);

        System.out.println("\n--- Initial Account Details ---");
        myAccount.displayDetails();

        System.out.print("\nEnter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        myAccount.deposit(depositAmount);

        System.out.println("\n--- Updated Account Details ---");
        myAccount.displayDetails();

        sc.close();
    }
}