class rectangel {
    protected int length;
    protected int breadth;

    public void setLength(int length) {
        this.length = length;
    }
    public int getLength() {
        return length;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public int getBreadth() {
        return breadth;
    }

    public double parameter() {
        return 2 * (length + breadth);
    }
    public double area() {
        return length * breadth;
    }
}

class cuboid extends rectangel {
    private int height;

    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }

    public double parameter() {
        return 4 * (length + breadth + height);
    }
    public double volume() {
        return length * breadth * height;
    }
}

public class areaVolumeSecond {
    public static void main(String[] args) {
        cuboid obj = new cuboid();

        obj.setLength(14);
        obj.setBreadth(6);
        obj.setHeight(9);

        System.out.println(obj.parameter());
        System.out.println(obj.area());
        System.out.println(obj.parameter());
        System.out.println(obj.volume());
    }
} 