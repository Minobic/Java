import java.util.Scanner;

public class websiteChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a url here:");
        String website = sc.next();
        if(website.endsWith(".com")) {
            System.out.println(website + " is a Commercial Website");
        } else if (website.endsWith(".org")) {
            System.out.println(website + " is a Organization Website");
        } else if (website.endsWith(".in")) {
            System.out.println(website + " is a Indian Website");
        }
    }
}