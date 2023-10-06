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
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("Welcome");
        }
    }
}

public class sleepMethod {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();

        t1.run();
        t2.run();
    }
}