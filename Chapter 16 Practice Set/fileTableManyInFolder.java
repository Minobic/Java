import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileTableManyInFolder {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        for (int j = 2; j <= 9; j++) {
            for (int i = 1; i <= 10; i++) {
                String table = i + " x " + j + " = " + i * j + "\n";
                File file = new File("./Tables/Multiplication Table" + j + ".txt");

                try {
                    file.createNewFile();
                    System.out.println("File created successfully!");
                } catch (IOException e) {
                    System.out.println("Unable to create this file");
                    e.printStackTrace();
                }

                try {
                    FileWriter fileWriter = new FileWriter(file, true); // Use true to append to the file
                    fileWriter.write(table);
                    System.out.println("File written successfully!");
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
    }
}