import java.util.HashSet;

public class tryToStoreDuplicateSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(9);
        hs.add(1);
        hs.add(5);
        hs.add(8);
        hs.add(7);
        hs.add(2);
        hs.add(5); 

        System.out.println(hs);
    }
}