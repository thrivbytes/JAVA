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
}

public class CylinderExample {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();

        c.setRadius(7.5);
        c.setHeight(12.3);

        System.out.println("Cylinder Details:");
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Height: " + c.getHeight());
    }
}
