import java.util.Scanner;

public class inputComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int a = sc.nextInt();
        System.out.println(a>8);
    }
}