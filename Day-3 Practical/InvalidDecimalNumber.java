class InvalidDecimalNumberException extends Exception {
    public InvalidDecimalNumberException(String message) {
        super(message);
    }
}
public class InvalidDecimalNumber {
    public static void main(String[] args) {
        try {
            String userInput = getUserInput();
            if (!isValidDecimal(userInput)) {
                throw new InvalidDecimalNumberException("Invalid decimal number entered");
            }
            System.out.println("User input is: " + userInput);
        } catch (InvalidDecimalNumberException e) {
            System.out.println("Caught InvalidDecimalNumberException: " + e.getMessage());
        }
    }
    private static String getUserInput() {
        return "abc";
    }
    private static boolean isValidDecimal(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
