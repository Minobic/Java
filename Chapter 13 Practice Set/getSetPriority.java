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

public class getSetPriority {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();

        t1.setPriority(5);
        t2.setPriority(15);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.run();
        t2.run();
    }
}