class cylinder {
    private int radius;
    private int height;

    public void setRadius(int n) {
        radius = n;
    }
    public int getRadius() {
        return radius;
    }

    public void setHeight(int n) {
        height = n;
    }
    public int getHeight() {
        return height;
    }
}
public class cylinderRH {
    public static void main(String[] args) {
        cylinder cyl = new cylinder();
        cyl.setRadius(5);
        cyl.setHeight(4);

        System.out.println(cyl.getRadius());
        System.out.println(cyl.getHeight());
    }
}