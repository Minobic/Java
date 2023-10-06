public class sumEvenNum {
    public static void main(String[] args) {
        int sum = 0;
        int n = 5;
        int i = 0;
        while (i < n) {
            sum = sum + (2*i);
            i++;
        }
        System.out.print("Sum of even nmbers is: ");
        System.out.println(sum);
    }
}