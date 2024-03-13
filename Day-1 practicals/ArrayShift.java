public class ArrayShift {
    public static void main(String[] args) {
        int[] A = {5, 8, 3, 9, 2};
        int[] B = {3, 6, 2, 7, 4};
        if (A.length != B.length) {
            System.out.println("Arrays A and B must have the same length.");
            return;
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] > B[i]) {
                for (int j = 0; j < A.length - 1; j++) {
                    A[j] = A[j + 1];
                    B[j] = B[j + 1];
                }
                A[A.length - 1] = 0;
                B[B.length - 1] = 0;
            } else {
                for (int j = A.length - 1; j > 0; j--) {
                    A[j] = A[j - 1];
                    B[j] = B[j - 1];
                }
                A[0] = 0;
                B[0] = 0;
            }
        }
        System.out.println("Shifted arrays:");
        System.out.println("A: " + java.util.Arrays.toString(A));
        System.out.println("B: " + java.util.Arrays.toString(B));
    }
}
