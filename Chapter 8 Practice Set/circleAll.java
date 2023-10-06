class circle {
    int radius;
    float pi = 22/7;
    public float area() {
        return pi * radius * radius;
    }
    public float parameter() {
        return 2 * pi * radius;
    }
}

public class circleAll {
    public static void main(String[] args) {
        circle circle1 = new circle();
        circle1.radius = 5;
        System.out.println(circle1.area());
        System.out.println(circle1.parameter());
    }
}