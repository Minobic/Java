import java.util.Scanner;

public class nameChanger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String letter = "Hii <|name|>, How may i help you?";

        System.out.println("Plese Enter your name:");
        String name = sc.nextLine();

        letter = letter.replace("<|name|>", name);
        System.out.println(letter);

    }
}