import java.util.Arrays;
public class Eqalizearray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3};

        System.out.println("Before equalization:");
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        if (array1.length != array2.length) {
            int minSize = Math.min(array1.length, array2.length);
            if (array1.length > minSize) {
                array1 = Arrays.copyOf(array1, minSize);
            } else {
                array2 = Arrays.copyOf(array2, minSize);
            }
        }
        System.out.println("\nAfter equalization:");
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
    }
}