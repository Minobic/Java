import java.util.Scanner;

public class spaceTo_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the setence to modify from space to _:");
        String space = sc.nextLine();

        System.out.print("This is modified version to _: ");
        System.out.println(space.replace(" ", "_"));
    }
}