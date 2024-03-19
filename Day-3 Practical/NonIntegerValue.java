class NonIntegerValueException extends Exception {
    public NonIntegerValueException(String message) {
        super(message);
    }
}
public class NonIntegerValue {
    public static void main(String[] args) {
        try {
            String userInput = getUserInput();
            if (!isValidInteger(userInput)) {
                throw new NonIntegerValueException("Non-integer value entered");
            }
            System.out.println("User input is: " + userInput);
        } catch (NonIntegerValueException e) {
            System.out.println("Caught NonIntegerValueException: " + e.getMessage());
        }
    }
    private static String getUserInput() {
        return "3.14";
    }
    private static boolean isValidInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
