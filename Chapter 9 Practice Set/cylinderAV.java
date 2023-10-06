class cylinder {
    private int radius;
    private int height;

    void setRadius(int n) {
        radius = n;
    }
    int getRadius() {
        return radius;
    }

    void setHeight(int n) {
        height = n;
    }
    int getHeight() {
        return height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}
public class cylinderAV {
    public static void main(String[] args) {
        cylinder cyl = new cylinder();
        cyl.setRadius(9);
        cyl.setHeight(12);

        System.out.println(cyl.getRadius());
        System.out.println(cyl.getRadius());

        System.out.println(cyl.surfaceArea());
        System.out.println(cyl.volume());
    }
}