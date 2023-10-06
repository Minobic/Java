import java.util.Scanner;

public class isInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] num = {25, 54, 63, 43, 24};
        int inNum = sc.nextInt();
        Boolean isInArray = false;

        for (int element : num) {
            if (inNum == element) {
                System.out.println("Yes! " + inNum + " is present in array.");
            } else {
                System.out.println("No! " + inNum + " is not present in array.");
            }
            break;
        }

    }
}