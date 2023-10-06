class circle {
    public int radius;

    circle(int radius) {
        System.out.println("I'm circle paramaterized constructor");
        this.radius = radius;
    }
}

class cylinder extends circle {
    public int height;

    cylinder(int radius, int height) {
        super(radius);
        System.out.println("I'm cylinder paramaterized constructor");
        this.height = height;
    }
}

public class circleCylinder {
    public static void main(String[] args) {
        // circle obj = new circle(15);
        cylinder obj = new cylinder(15, 4);
    }
}