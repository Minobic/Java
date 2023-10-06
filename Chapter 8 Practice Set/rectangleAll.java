class rectangle {
    int side1, side2;
    public int area() {
        return side1 * side2;
    }
    public int parameter() {
        return 2 * side1 + 2 * side2;
    }
}

public class rectangleAll {
    public static void main(String[] args) {
        rectangle rectangle1 = new rectangle();
        rectangle1.side1 = 5;
        rectangle1.side2 = 6;
        System.out.println(rectangle1.area());
        System.out.println(rectangle1.parameter());
    }
}
