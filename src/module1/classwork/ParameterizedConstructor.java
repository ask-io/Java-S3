package module1.classwork;
import java.util.Scanner;

class Box2 {
	double w, h, d;
	Box2(double height, double width, double depth){
		w=width;
		h=height;
		d=depth;
	}
	
	double calVolume() {
		return(h*d*w);
	}
}

public class ParameterizedConstructor {
	public static void main(String[] args) {
		System.out.println("Enter the height, width and depth:");
		Scanner sc = new Scanner(System.in);
		double height = sc.nextInt();
		double width= sc.nextInt();
		double depth = sc.nextInt();
		Box2 b = new Box2(height, width, depth);
		double vol=b.calVolume();
		System.out.println("w="+b.w+",d="+b.d+",h="+b.h);
		System.out.println("vol="+vol);
		sc.close();	
		
	}
}
