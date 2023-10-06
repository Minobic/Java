class thread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
        }
    }
}

class thread2 extends Thread {
    public void run() {
        // while (true) {
            System.out.println("Welcome");
        // }
    }
}

public class currentThread {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();

        // t1.run();
        t2.run();

        System.out.println(Thread.currentThread().getState());      // Prints the data about current thread
    }
}