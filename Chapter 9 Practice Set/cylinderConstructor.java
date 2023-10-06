class cylinder {
    private int radius;
    private int height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }
    public int getHeight() {
        return height;
    }
}

public class cylinderConstructor {
    public static void main(String[] args) {
        cylinder cyl = new cylinder(15, 46);

        System.out.println(cyl.getRadius());
        System.out.println(cyl.getHeight());
    }
}