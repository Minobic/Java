import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class formateUsingTimeAPI {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("H:m:s");
        String customTime = lt.format(dtf);

        System.out.println(customTime);
    }
}