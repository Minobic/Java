public class sumOfNaturalIterative {
    static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
