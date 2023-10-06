class depClass {
    @Deprecated
    void meth1() {
        System.out.println("I am method 1");
    }
}

public class supressDeprecated {
    @SuppressWarnings ( "deprecation" )
    public static void main(String[] args) {
        depClass dc = new depClass();
        dc.meth1();
    }
}
