package classwork;

class Student {
    String name;
    int rollNumber;
    String department;

    public Student(String name, int rollNumber, String department) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
    }

    public void printStudentInfo() {
        System.out.println("Student Information:");
        System.out.println("Name        : " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Department  : " + department);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Abhijit", 02, "CSE");
        Student student2 = new Student("Someone", 56, "CE");

        student1.printStudentInfo();
        student2.printStudentInfo();
    }
}