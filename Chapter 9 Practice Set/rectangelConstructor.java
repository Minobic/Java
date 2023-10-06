class rectangel {
    private int l = 65;
    private int b = 35;

    public rectangel(int l, int b) {
        this.l = l;
        this.b = b;
    }
    
    public int getL() {
        return l;
    }
    public int getB() {
        return b;
    }
}

public class rectangelConstructor {
    public static void main(String[] args) {
        rectangel rec = new rectangel(6, 4);

        System.out.println(rec.getL());
        System.out.println(rec.getB());
    }
}