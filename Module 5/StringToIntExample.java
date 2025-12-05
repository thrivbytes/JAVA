import java.util.Scanner;

public class StringToIntExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        try {
            
            String firstThree = name.substring(0, 3);
            int result = Integer.parseInt(firstThree);
            System.out.println("The integer value is: " + result);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("The name is too short (less than 3 characters).");
        } catch (NumberFormatException e) {
            System.out.println("The first three characters are not numeric and cannot be converted to an integer.");
        }
    }
}