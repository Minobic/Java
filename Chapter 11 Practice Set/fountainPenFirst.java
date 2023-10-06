abstract class pen {
    abstract void write();
    abstract void refill();
}

class fountainPen extends pen {
    void write() {
        System.out.println("Writting...");
    }
    void refill() {
        System.out.println("Refilling...");
    }
    void changeNib() {
        System.out.println("Changing the nib...");
    }
} 

public class fountainPenFirst {
    public static void main(String[] args) {
        fountainPen fPen = new fountainPen();

        fPen.write();
        fPen.refill();
        fPen.changeNib();
    }
}