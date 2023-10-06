class rectangel {
    public int length;
    public int breadth;

    rectangel(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double parameter() {
        return 2 * (length + breadth);
    }
}

class cuboid extends rectangel {
    public int height;

    cuboid(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }
    public double parameter() {
        return 4 * (length + breadth + height);
    }
}

public class rectangelCuboid {
    public static void main(String[] args) {
        cuboid obj = new cuboid(15, 4, 9);

        System.out.println(obj.parameter());
        System.out.println(obj.parameter());
    }
}