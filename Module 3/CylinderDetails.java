class Cylinder {
    private double radius;
    private double height;

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    void setHeight(double height) {
        this.height = height;
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

public class CylinderDetails {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();

        c.setRadius(7.0);
        c.setHeight(10.0);

        System.out.println("Cylinder Details:");
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Height: " + c.getHeight());
        System.out.println("Surface Area: " + c.surfaceArea());
        System.out.println("Volume: " + c.volume());
    }
}
