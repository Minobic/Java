public class reverseTable {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 10; i >= 1; i--) {
            System.out.printf("%d x %d = %d", n, i, n*i);
            System.out.println();
        }
    }
}