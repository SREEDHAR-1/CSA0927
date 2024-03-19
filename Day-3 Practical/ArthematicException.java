public class ArthematicException {
        public static void main(String[] args) {
            try {
                int result1 = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: Divided by Zero");
            }
            try {
                double number = -1;
                if (number <= 0) {
                    throw new IllegalArgumentException("Logarithm of negative or zero is undefined");
                }
                double result2 = Math.log(number);
            } catch (IllegalArgumentException e) {
                System.out.println("Caught IllegalArgumentException: " + e.getMessage());
            }
            if (Math.toDegrees(Math.atan(1)) == 90) {
                System.out.println("Tangent of 90 degrees is undefined.");
            }
            if (isZeroToThePowerOfZero(0, 0)) {
                System.out.println("Zero to the power of zero is undefined.");
            }
        }

        private static boolean isZeroToThePowerOfZero(double base, double exponent) {
            return base == 0 && exponent == 0;
        }
    }

