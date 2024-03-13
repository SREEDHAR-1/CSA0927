public class javaarray {
    public static void main(String[] args) {
        int[][] matrixA = new int[9][1];
        int[][] matrixB = new int[9][1];
        for (int i = 0; i < 9; i++) {
            matrixA[i][0] = i + 1;
        }
        for (int i = 0; i < 9; i++) {
            matrixB[i][0] = 9 - i;
        }
        System.out.println("Matrix A:");
        printMatrix(matrixA);
        System.out.println("\nMatrix B:");
        printMatrix(matrixB);
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}