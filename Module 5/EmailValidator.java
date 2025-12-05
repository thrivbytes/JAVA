import java.util.Scanner;

// Custom Exception Class
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

// Main Class
public class EmailValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        try {
            // Check if '@' is missing
            if (!email.contains("@")) {
                throw new InvalidEmailException("Invalid Email: '@' symbol is missing!");
            }

            System.out.println("Valid Email!");
        } 
        catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}import java.util.Scanner;

// Custom Exception Class
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

// Main Class
public class EmailValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        try {
            // Check if '@' is missing
            if (!email.contains("@")) {
                throw new InvalidEmailException("Invalid Email: '@' symbol is missing!");
            }

            System.out.println("Valid Email!");
        } 
        catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}