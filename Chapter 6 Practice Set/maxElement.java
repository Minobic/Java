public class maxElement {
    public static void main(String[] args) {
        int [] maxA = {1 , 5 , 24 , 6 , 17};
        int max = maxA[0];

        for (int i = 1; i < maxA.length; i++) {
            if (maxA[i] > max) {
                max = maxA[i];
            }
        }

        System.out.println("Maximum value in given array is: " + max);
    }
}