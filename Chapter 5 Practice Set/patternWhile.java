import java.util.Scanner;

public class patternWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int star = sc.nextInt();
        int i = star;
        while (i > 0) {
            int j = 0;
            while (j < i) {
                System.out.print("*");  
                j++; 
            }
            System.out.println("\n");
            i--;
        }
    }
}