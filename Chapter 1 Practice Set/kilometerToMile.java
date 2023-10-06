import java.util.Scanner;

public class kilometerToMile {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the kilometers:");
        double kilometers = sc.nextDouble();

        double miles = kilometers * 0.62137119;
        System.out.println(kilometers + " Kilometers is equal to " + miles + " Miles.");
    }
}