import java.util.Scanner;

public class percentageWithMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of First subject:");
        float sub1 = sc.nextInt();
        System.out.println("Enter the marks of Second subject:");
        float sub2 = sc.nextInt();
        System.out.println("Enter the marks of Third subject:");
        float sub3 = sc.nextInt();

        float sum = sub1 + sub2 + sub3;
        float percentage = (sum / 300) * 100;

        System.out.print("Your Percentage is " + percentage + "% and ");

        if (percentage >= 40 && sub1 >= 33 && sub2 >= 33 && sub3 >= 33) {
            System.out.println("Congretulation!, You are passed!");
        } else {
            System.out.println("Sorry!, You are failed!");
        }
    }
}