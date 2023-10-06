public class sumEvenNumWhile {
    public static void main(String[] args) {
        int sum = 0;
        int n = 5;
        for (int i = 0; i < n; i++) {
            sum = sum + (2*i);
        }
        System.out.print("Sum of even nmbers is: ");
        System.out.println(sum);
    }
}
