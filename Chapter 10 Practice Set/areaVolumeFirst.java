class circle {
    public int radius;

    circle(int radius) {
        System.out.println("I'm circle paramaterized constructor");
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}

class cylinder extends circle {
    public int height;

    cylinder(int radius, int height) {
        super(radius);
        System.out.println("I'm cylinder paramaterized constructor");
        this.height = height;
    }
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class areaVolumeFirst {
    public static void main(String[] args) {
        // circle obj = new circle(15);
        cylinder obj = new cylinder(15, 4);

        System.out.println(obj.area());
        System.out.println(obj.volume());
    }
}