import java.util.Date;

public class formateUsingDate {
    public static void main(String[] args) {
        Date d = new Date();

        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
    }
}