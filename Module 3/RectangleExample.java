class Rectangle {
    private double length;
    private double breadth;

    // Default constructor
    Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    // Parameterized constructor (Overloaded)
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }

    void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}

public class RectangleExample {
    public static void main(String[] args) {
        System.out.println("Default Rectangle:");
        Rectangle r1 = new Rectangle();
        r1.display();

        System.out.println("\nCustom Rectangle:");
        Rectangle r2 = new Rectangle(10, 8);
        r2.display();
    }
}
