class thread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
        }
    }
}

class thread2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Welcome");
        }
    }
}

public class continuosPrint {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();

        t1.run();
        t2.run();
    }
}