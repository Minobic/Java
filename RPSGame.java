import java.util.Scanner;
import java.util.Random;

public class RPSGame {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random(3);

        int chance = 0;
        int ui = 0;
        int ci = 0;

        System.out.println("--Welcome to RPS game--");
        while (chance<3) {
            chance++;
            System.out.println("Choose any one of the option below:\n1) Rock\n2) Paper\n3) Scissor");
        
            int player = sc.nextInt();
            int pc = rn.nextInt(3);

            if (player == 1 && pc == 1) {
                System.out.println("This Match Tied We both selected Rock");
            } else if (player == 1 && pc == 2) {
               System.out.println("You loose! I selected Paper which coveres rock");
               ci++;
            } else if (player == 1 && pc == 3) {
            System.out.println("You Won! I selected Scissor which is broken by Scissor");
            ui++;
            }

            if (player == 2 && pc == 1) {
                System.out.println("You Won! I selected rock which is covered by Paper");
                ui++;
            } else if (player == 2 && pc == 2) {
                System.out.println("This Match Tied We both selected Paper");
            } else if (player == 2 && pc == 3) {
                System.out.println("You loose! I selected Scissor which cuts Paper");
                ci++;
            }

            if (player == 3 && pc == 1) {
                System.out.println("You loose! I selected Rock which brecks Scissor");
                ci++;
            } else if (player == 3 && pc == 2) {
                System.out.println("You Won! I selected Paper wich is cut by Scissor");
                ui++;
            } else if (player == 3 && pc == 3) {
                System.out.println("This Match Tied We both selected Scissor");
            }
            
            if (player != 1 && player != 2 && player != 3) {
                System.out.println("Enter a valid Number!");
            }
        }

        if (ui>ci) {
            System.out.println("\n--Scoreboard--\nYour Points: " + ui + "\nMy Points: " + ci + "\nYou Won this match!");
        } else if (ui<ci) {
            System.out.println("\n--Scoreboard--\nYour Points: " + ui + "\nMy Points: " + ci + "\nYou Loose this match!");
        } else if (ui==ci) {
            System.out.println("\n--Scoreboard--\nYour Points: " + ui + "\nMy Points: " + ci + "This match is Tied!");
        }
    }
}