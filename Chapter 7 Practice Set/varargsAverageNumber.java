public class varargsAverageNumber {
    static float argument(int ...arr) {
        float result = 0;
        float sum = 0;
        for (int i : arr) {
            // System.out.println(i);
            sum += i ;
        }
        result = sum/arr.length;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(argument(2,3,4,5));
    }
}
