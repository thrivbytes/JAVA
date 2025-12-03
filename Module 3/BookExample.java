class Book {
    String title;
    String author;
    double price;

    Book() {
        System.out.println("Default Constructor:");
        System.out.println("Title: Unknown");
        System.out.println("Author: Unknown");
        System.out.println("Price: 0.0\n");
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        System.out.println("Constructor with Title and Author:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Not Set\n");
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Constructor with All Fields:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price + "\n");
    }
}

public class BookExample {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Wings of Fire", "A.P.J. Abdul Kalam");
        Book b3 = new Book("The Alchemist", "Paulo Coelho", 499.99);
    }
}
