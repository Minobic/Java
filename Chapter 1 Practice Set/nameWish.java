import java.util.Scanner;

public class nameWish {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name:");
        String name = sc.next();

        System.out.println("Hello " + name + " have a good day!");
    }
}