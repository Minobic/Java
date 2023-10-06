import java.util.Scanner;

public class stringToLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the words to transform into Lower case:");
        String Name = sc.nextLine();

        System.out.print("This is modified version of lower case: ");
        System.out.println(Name.toLowerCase());
    }
}