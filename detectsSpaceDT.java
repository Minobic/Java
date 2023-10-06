import java.util.Scanner;

public class detectsSpaceDT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a sentence to recognise spaces:");
        String space = sc.nextLine();

        System.out.print("Double space occure at: ");
        System.out.println(space.indexOf("  "));

        System.out.print("Triple space occure at: ");
        System.out.println(space.indexOf("   "));

    }
}