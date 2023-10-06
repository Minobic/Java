import java.util.Scanner;

class maxException extends Exception {
    @Override
    public String toString() {
    return "You only have 5 attempts";
    }
    @Override
    public String getMessage() {
        return "Max attempts reached";
    }
}

public class problem3CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = new int[3];
        marks[0] = 1;
        marks[1] = 56;
        marks[2] = 5;

        boolean a = true;
        int index;
        int i = 0;

        while (a && i < 5) {
            System.out.println("Enter a index: ");
            index = sc.nextInt();

            try {
                System.out.println("The value of marks[index] is: " + marks[index]);
                break;
            } catch (Exception e) {
                System.out.println("Error! Please enter a valid index");
                i++;
            }
        }

        if (i >= 5) {
            try {
                throw new maxException();
            } catch (maxException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
