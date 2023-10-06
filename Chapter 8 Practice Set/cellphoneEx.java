class cellphone {
    public void ring() {
        System.out.println("Ringing...");
    }
    public void vibrate() {
        System.out.println("Vibrating...");
    }
}

public class cellphoneEx {
    public static void main(String[] args) {
        cellphone samsung = new cellphone();
        samsung.ring();
        samsung.vibrate();
    }    
}