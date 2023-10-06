public class gradeEncrypt {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);

        // Decrypting the Grade
        grade = (char) (grade - 8);
        System.out.println(grade);
    }
}