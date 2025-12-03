import java.util.Scanner;

public class BitwiseOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();

        int andResult = num1 & num2;
        int orResult = num1 | num2;
        int xorResult = num1 ^ num2;

        System.out.println("\n--- Bitwise Operation Results ---");
        System.out.println("AND (&): " + andResult + " (Binary: " + Integer.toBinaryString(andResult) + ")");
        System.out.println("OR (|): " + orResult + " (Binary: " + Integer.toBinaryString(orResult) + ")");
        System.out.println("XOR (^): " + xorResult + " (Binary: " + Integer.toBinaryString(xorResult) + ")");

        sc.close();
    }
}
