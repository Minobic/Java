public interface exceptionO {
    public static void main(String[] args) {
        try {
            int a = 2, b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Haha");
        } catch (IllegalArgumentException e) {
            System.out.println("Hehe");
        }
    }
}
