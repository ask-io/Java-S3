package module1.tutorial4;
import java.util.Scanner;

class Circle {
	float radius;
	Circle(float radius){
		this.radius = radius;
	}
	public void DisplayArea() {
		System.out.printf("Area: %.2f\n", (3.14*radius*radius));
	}
	public void DisplayCircumference() {
		System.out.printf("Circumference: %.2f\n", (2*3.14*radius));
	}
}

class CircleDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Radius: ");
        float r = sc.nextFloat();
        
        Circle ob = new Circle(r);
        ob.DisplayArea();
        ob.DisplayCircumference();
        
        sc.close();
	}
}
