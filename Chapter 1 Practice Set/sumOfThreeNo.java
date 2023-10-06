import java.util.Scanner;

public class sumOfThreeNo {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Firt number:");
        float num1 = sc.nextFloat();

        System.out.println("Enter Second number:");
        float num2 = sc.nextFloat();

        System.out.println("Enetr Third number:");
        float num3 = sc.nextFloat();

        float sum = num1 + num2 + num3;
        System.out.print("The sum of the above given number is: ");
        System.out.println(sum);
    }
}