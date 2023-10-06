import java.util.Scanner;

public class percentageCalculator {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);


         System.out.println("Total number of marks:");
         int tMarks = sc.nextInt();

         System.out.println("Marks Obtained in First Subject:");
         float m1 = sc.nextFloat();

         System.out.println("Marks Obtained in Second Subject:");
         float m2 = sc.nextFloat();

         System.out.println("Marks Obtained in Third Subject:");
         float m3 = sc.nextFloat();

         System.out.println("Marks Obtained in Fourth Subject:");
         float m4 = sc.nextFloat();

         System.out.println("Marks Obtained in Fifth Subject:");
         float m5 = sc.nextFloat();

         float percentage = ((m1 + m2 + m3 + m4 + m5) * 100 / tMarks);
         System.out.print("Here is your total percentage: ");
         System.out.print(percentage);
         System.out.println("%");
    }
}