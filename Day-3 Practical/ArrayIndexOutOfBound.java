public class ArrayIndexOutOfBound {
        public static void main(String[] args) {
            try {
                int[] arr1 = {1, 2, 3};
                int element = arr1[3];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException: Accessing an array element outside its bound");
            }

            try {
                // Iterating beyond the array length
                int[] arr2 = {4, 5, 6};
                for (int i = 0; i <= arr2.length; i++) {
                    int element = arr2[i];
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException: Iterating beyond the array length");
            }

            try {
                int[][] arr3 = {{1, 2}, {3, 4, 5}};
                int element = arr3[1][3];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException: Nested array and incorrect index");
            }

            try {
                int[] arr4 = {7, 8, 9};
                accessArray(arr4, 3);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException: Passing incorrect array to the method");
            }
        }
        private static void accessArray(int[] arr, int index) {
            int element = arr[index];
        }
    }


