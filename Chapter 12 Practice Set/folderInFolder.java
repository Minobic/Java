package folder.folder1.folder2;

class Calculator {
    public void calculate(int a, int b) {
        System.out.println("Result: " + (a + b));
    }
}

class ScCalculator {
    public void calculate(int a, int b) {
        System.out.println("Result: " + Math.sin(a + b));
    }
}

class hyCalculator {
    public void calculate(int a, int b) {
        System.out.println("Result: " + (a + b));
        System.out.println("Result: " + Math.sin(a + b));
    }
}

public class folderInFolder {
    public static void main(String[] args) {
        System.out.println("Hello!");
    }
}