interface tvRemote {
    void pressButton();
}

interface smartTVRemote extends tvRemote {
    void blutooth();
}

class remote implements tvRemote, smartTVRemote{
    public void pressButton() {
        System.out.println("Pressing button...");
    }
    public void blutooth() {
        System.out.println("Blutoots on...");
    }
}

public class tvRemoteS {
    public static void main(String[] args) {
        remote r = new remote();
        r.blutooth();
    }
}