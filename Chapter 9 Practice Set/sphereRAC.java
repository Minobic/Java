class sphere {
    private double radius;
    private double area;
    private double circumference;

    public sphere(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return 1.3333 * Math.PI * radius * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class sphereRAC {
    public static void main(String[] args) {
        sphere sph = new sphere(5);

        System.out.println(sph.getRadius());
        System.out.println(sph.getArea());
        System.out.println(sph.getCircumference());
    }
}