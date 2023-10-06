public class reverseArray {
    public static void main(String[] args) {
        int [] reverse = {1, 2, 3, 4, 5, 6};
        int l = reverse.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for (int i = 0; i < n; i++) {
            // Swap a[i] and a[l-1-i]
            // [3] [4] []
            temp = reverse[i];
            reverse[i] = reverse[l-i-1];
            reverse[l-i-1] = temp;
        }
        for (int element : reverse) {
            System.out.print(element + " ");
        }
    }
}