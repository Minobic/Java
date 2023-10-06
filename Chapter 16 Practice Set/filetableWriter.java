import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filetableWriter {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc1.nextInt();
        String table = "";
        for (int i = 1; i <= 10; i++) {
            table += i + " x " + a + " = " + i * a;
            table += "\n";
        }

        File file = new File("Multiplication Table.txt");
        
        try {
            file.createNewFile();
            System.out.println("File created sucessfully!");
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }

        try {
            FileWriter fileWriter = new FileWriter("Multiplication Table.txt");
            fileWriter.write(table);
            System.out.println("File writen sucessfully!");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error while writing the file");
            e.printStackTrace();
        }

        try {
            Scanner sc2 = new Scanner(file);
            while (sc2.hasNextLine()) {
                String line = sc2.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error while reading the file");
            e.printStackTrace();
        }
    }
}