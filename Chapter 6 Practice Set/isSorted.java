public class isSorted {
    public static void main(String[] args) {
        int [] arr = {1, 51, 21, 32, 95, 9};
        boolean sorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) {
            System.out.println("Yes! it's sorted");
        } else {
            System.out.println("No! it's not sorted");
        }
    }
}