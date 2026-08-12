package classwork;
import java.util.Scanner;
class Box {
	double width;
	double height;
	double depth;
	
	double calVolume() {
		return(height*depth*width);
	}
}
public class BoxDemo {

	public static void main(String[] args) {
		Box mybox = new Box();
		mybox.width = 5;
		mybox.height = 5;
		mybox.depth = 5;
		double vol = mybox.calVolume();
		System.out.println("The volume of box is "+vol);

	}

}
