class telephone {
    public void ring() {
        System.out.println("Ringing...");
    }
    public void lift() {
        System.out.println("Lifting...");
    }
    public void disconnect() {
        System.out.println("Disconnecting...");
    } 
}

class smartTelephone extends telephone{
    void ringtone() {
        System.out.println("Ringing ringtonr...");
    }
}

public class telephoneS {
    public static void main(String[] args) {
        telephone st = new smartTelephone();
        // st.ringtone();       // Error
    }
}