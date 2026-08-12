package module1.tutorial4;
import java.util.Scanner;

class Employee {
	int empId;
	String empName;
	double salary;

	Employee(int empId, String empName, double salary){
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public void displayEmployee() {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
	}
}

class EmployeeDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter details for Employee 1:");
        System.out.print("Enter Employee ID: ");
        int id1 = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Employee Name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary1 = sc.nextDouble();

        Employee emp1 = new Employee(id1, name1, salary1);

        System.out.println("\nEnter details for Employee 2:");
        System.out.print("Enter Employee ID: ");
        int id2 = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Employee Name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary2 = sc.nextDouble();
        
        Employee emp2 = new Employee(id2, name2, salary2);
        
        System.out.println("\n--- Employee Details ---");
        emp1.displayEmployee();
        System.out.println();
        emp2.displayEmployee();
        
        sc.close();
	}
	
}