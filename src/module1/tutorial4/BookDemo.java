package module1.tutorial4;
import java.util.Scanner;

class Book {
	String title;
	String author;
	float price;
	
	Book(String title, String author, float price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
		
	public void displayBookInfo() {
		System.out.printf("Title: %s\n", title);
		System.out.printf("Author: %s\n", author);
	    System.out.printf("Price: %.2f\n", price);
	}
}

class BookDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter details for Book 1:");
        System.out.print("Enter Book Title: ");
        String title1 = sc.nextLine();
        System.out.print("Enter Book Author: ");
        String author1 = sc.nextLine();
        System.out.print("Enter Book Price: ");
        float price1 = sc.nextFloat();
        
        Book book1 = new Book(title1, author1, price1);
        sc.nextLine(); // Consume newline
        System.out.println("Enter details for Book 2:");
        System.out.print("Enter Book Title: ");
        String title2 = sc.nextLine();
        System.out.print("Enter Book Author: ");
        String author2 = sc.nextLine();
        System.out.print("Enter Book Price: ");
        float price2 = sc.nextFloat();
        
        Book book2 = new Book(title2, author2, price2);
        
        System.out.println("\n--- Book Details ---");
        book1.displayBookInfo();
        System.out.println();
        book2.displayBookInfo();
        
        sc.close();
	}
	
}