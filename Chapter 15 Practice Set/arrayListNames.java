import java.util.ArrayList;

public class arrayListNames {
    public static void main(String[] args) {
        ArrayList<String> arl = new ArrayList<>();

        arl.add("Student 1");
        arl.add("Student 2");
        arl.add("Student 3");
        arl.add("Student 4");
        arl.add("Student 5");
        arl.add("Student 6");
        arl.add("Student 7");
        arl.add("Student 8");
        arl.add("Student 9");
        arl.add("Student 10");

        for (Object o : arl) {
            System.out.println(o);
        }
    }
}
