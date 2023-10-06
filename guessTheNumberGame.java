import java.util.Scanner;
import java.util.Random;

class guessTheNumber {
    int random;
    int userInput;

    int randomGen() {
        Random rd = new Random();
        random = rd.nextInt(100) + 1;
        return random;
    }
    void uInput(int n) {
        userInput = n;
    }
    void isNoCorrect() {
        if (userInput == random) {
            System.out.println("You guessed the right number!");
        } else if (userInput > random) {
            System.out.println("You guessed too big number think of a lil small!");
        } else if (userInput < random) {
            System.out.println("You guessed too small number think of a lil big!");
        } else {
            System.out.println("Input a valid number!");
        }
    }
    void noOfGuess(int n) {
        System.out.printf("You take a total of %d guesses!\n", n);
    }
}
public class guessTheNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfGuess = 0;

        guessTheNumber guess = new guessTheNumber();
        int randomNumber = guess.randomGen();

        while (true) {
            System.out.print("Guess a number between 1 - 100: ");
            int input = sc.nextInt();
            guess.uInput(input);
            noOfGuess++;

            guess.isNoCorrect();

            if (guess.userInput == randomNumber) {
                break;
            }
        }
        guess.noOfGuess(noOfGuess);
        System.out.println("The random number was: " + randomNumber);
    }
}