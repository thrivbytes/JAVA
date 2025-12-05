import java.util.*;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        try {
            int size = sc.nextInt();

            int[] arr = new int[size]; // May throw NegativeArraySizeException
            System.out.println("Array created with size " + size);

        } catch (NegativeArraySizeException e) {
            System.out.println("Error: Array size cannot be negative!");
        }

        sc.close();
    }
}