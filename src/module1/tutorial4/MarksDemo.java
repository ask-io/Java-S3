package module1.tutorial4;
import java.util.Scanner;

class Marks {
    double mark1, mark2, mark3;

    Marks(double mark1, double mark2, double mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public double calculateTotal() {
        return mark1 + mark2 + mark3;
    }

    public double calculateAverage() {
        return calculateTotal() / 3.0;
    }
}

class MarksDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for three subjects:");
        System.out.print("Enter Mark 1: ");
        double m1 = sc.nextDouble();
        System.out.print("Enter Mark 2: ");
        double m2 = sc.nextDouble();
        System.out.print("Enter Mark 3: ");
        double m3 = sc.nextDouble();

        Marks student = new Marks(m1, m2, m3);

        System.out.println("\n--- Student Result ---");
        System.out.println("Total Marks: " + student.calculateTotal());
        System.out.println("Average Marks: " + student.calculateAverage());

        sc.close();
    }
}