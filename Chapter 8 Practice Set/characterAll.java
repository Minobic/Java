class tommyVecetti {
    public void hit() {
        System.out.println("Hitting...");
    }
    public void run() {
        System.out.println("Running...");
    }
    public void fire() {
        System.out.println("Firing...");
    }
}

public class characterAll {
    public static void main(String[] args) {
        tommyVecetti tommy = new tommyVecetti();
        tommy.hit();
        tommy.run();
        tommy.fire();
    }
}