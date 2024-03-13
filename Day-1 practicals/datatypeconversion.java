public class datatypeconversion {
    public static void main(String[] args) {
        byte byteValue = 100;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;

        System.out.println("Implicit conversion (widening):");
        System.out.println("Byte to Short: " + shortValue);
        System.out.println("Short to Int: " + intValue);
        System.out.println("Int to Long: " + longValue);
        System.out.println("Long to Float: " + floatValue);
        System.out.println("Float to Double: " + doubleValue);
        double doubleVal = 123456.789;
        float floatVal = (float) doubleVal;
        long longVal = (long) floatVal;
        int intVal = (int) longVal;
        short shortVal = (short) intVal;
        byte byteVal = (byte) shortVal;

        System.out.println("\nExplicit conversion (narrowing):");
        System.out.println("Double to Float: " + floatVal);
        System.out.println("Float to Long: " + longVal);
        System.out.println("Long to Int: " + intVal);
        System.out.println("Int to Short: " + shortVal);
        System.out.println("Short to Byte: " + byteVal);
        int overflowInt = Integer.MAX_VALUE + 1;
        int underflowInt = Integer.MIN_VALUE - 1;
        System.out.println("\nOverflow scenario:");
        System.out.println("Integer Overflow: " + overflowInt);

        System.out.println("\nUnderflow scenario:");
        System.out.println("Integer Underflow: " + underflowInt);
    }
}
