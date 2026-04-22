package Workbook12;

public class Main {
    public static void main(String[] args) {
        
        Cylinder cylinder = new Cylinder(5, 29);
        cylinder.setHeight(42);

        Sphere sphere = new Sphere(7);
        sphere.setRadius(9);

        System.out.println("\nCylinder Radius: " + cylinder.getRadius());
        System.out.println("Cylinder Height: " + cylinder.getHeight());
        System.out.println("Surface Area: " + cylinderVolume(cylinder.getRadius(),cylinder.getHeight()));
    }

    public static double cylinderVolume(double radius, double height) {
        double value = Math.PI * (radius * radius) * height;
        return value;
    }
}
