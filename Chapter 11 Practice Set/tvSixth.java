interface tvRemote {
    void pressButton();
}

interface smartTVRemote extends tvRemote {
    void blutooth();
}

class tv implements tvRemote {
    public void pressButton() {
        System.out.println("Pressing button...");
    }
}

public class tvSixth {
    public static void main(String[] args) {
        tv t = new tv();
        t.pressButton();
    }
}