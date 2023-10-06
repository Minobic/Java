public class sumArray {
    public static void main(String[] args) {
        float [] exaArray = {52.5f, 23.1f, 45.6f, 54.8f, 87.9f};
        float sum = 0;

        for (float newSum : exaArray) {
            sum = sum + newSum;
        }
        System.out.println("The value of sum is: " + sum);
    }
}
