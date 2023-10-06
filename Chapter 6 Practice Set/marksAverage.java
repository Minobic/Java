public class marksAverage {
    public static void main(String[] args) {
        int [] marks = {54, 89, 46, 74, 85};
        int sum = 0;
        
        for (int element : marks) {
            sum = sum + element;
        }

        int average  = sum/2;
        System.out.println("Here is your marks average: " + average); 
    }
}
