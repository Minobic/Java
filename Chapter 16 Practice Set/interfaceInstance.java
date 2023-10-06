interface I {
    public void meth1();
}

public class interfaceInstance {
    public static void main(String[] args) {
        I i = () -> System.out.println("Hello!");
        i.meth1();
    }
}