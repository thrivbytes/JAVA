class Cylinder {
    private double radius;
    private double height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    double getRadius() {
        return radius;
    }

    double getHeight() {
        return height;
    }

    double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class CylinderConstructor {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(7.0, 10.0);

        System.out.println("Cylinder Details:");
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Height: " + c.getHeight());
        System.out.println("Surface Area: " + c.surfaceArea());
        System.out.println("Volume: " + c.volume());
    }
}
