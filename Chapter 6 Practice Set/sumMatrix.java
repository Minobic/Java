public class sumMatrix {
    public static void main(String[] args) {
        int [][] matrix;
        matrix = new int [2][3];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        int [][] matrix2;
        matrix2 = new int [2][3];

        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        matrix2[0][2] = 3;
        matrix2[1][0] = 4;
        matrix2[1][1] = 5;
        matrix2[1][2] = 6;

        int [][] result;
        result = new int [2][3];

        result[0][0] = 0;
        result[0][1] = 0;
        result[0][2] = 0;
        result[1][0] = 0;
        result[1][1] = 0;
        result[1][2] = 0;

        for (int i = 0; i < matrix.length; i++) {           // Row number of times
            for (int j = 0; j < matrix2[i].length; j++) {   // Column number of times
                System.out.printf("Setting value for i = %d and j = %d \n", i, j);
                result[i][j] = matrix[i][j] + matrix2[i][j];
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
