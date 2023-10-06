public class trickyQuestion {
    public static void main(String[] args) {
        //float a = 7/4*9/2;        // a = ? but here's a twist answer is 7.87 but it will print 4
        float a = 7/4.0f*9/2.0f;    // to get the right answer we have to use f at the end
        System.out.println(a);      // a = 1.75*9/2 = 15.75/2 = 7.87
    }
}