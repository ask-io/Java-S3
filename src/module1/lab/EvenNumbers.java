package module1.lab;

public class EvenNumbers {

	public static void main(String[] args) {
		int i = 1;
		System.out.print("Even numbers between 1 and 20: ");
		do {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		} while (i <= 20);
		System.out.println();
	}

}