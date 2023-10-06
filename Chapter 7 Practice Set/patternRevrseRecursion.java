public class patternRevrseRecursion {
    static void printPatternRowRecur(int n) {
        if (n < 1)
            return;
        System.out.print( "* ");
        printPatternRowRecur(n - 1);
    }
      
    static void printPatternRecur(int n, int m) {
        if (m > n)
            return;
        printPatternRowRecur(m); 
        System.out.println ();
        printPatternRecur(n, m + 1);
          
    }
    public static void main (String[] args) {
        int n = 5;
        printPatternRecur(n, 1);
          
    }
}
