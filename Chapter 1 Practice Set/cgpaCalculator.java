import java.util.Scanner;

public class cgpaCalculator {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of First subject:");
        float a = sc.nextFloat();

        System.out.println("Enter marks of First subject:");
        float b = sc.nextFloat();

        System.out.println("Enter marks of First subject:");
        float c = sc.nextFloat();

        float cgpa = (a + b + c)/30;

        System.out.print("Here is your CGPA: ");
        System.out.println(cgpa);
    }
}