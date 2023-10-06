class square {
    int side;
    public int area() {
        return side * side;
    }
    public int parameter() {
        return 4 * side;
    }
}

public class squareAll {
    public static void main(String[] args) {
        square square1 = new square();

        square1.side = 5;
        System.out.println(square1.area());
        System.out.println(square1.parameter());
    }    
}