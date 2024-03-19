import java.util.InputMismatchException;
import java.util.Scanner;

class NonIntegerInputException extends Exception {
    public NonIntegerInputException(String value) {
        super("Error: '" + value + "' is not an integer.");
    }
}

class InputHandler {
    public static int getIntegerInput(String prompt) throws NonIntegerInputException {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);

        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                // Consume the invalid token
                scanner.next();
                throw new NonIntegerInputException(scanner.nextLine());
            }
        }
    }
}

public class ClassAndMethodLevel  {
    public static void main(String[] args) {
        try {
            int integerValue = InputHandler.getIntegerInput("Please enter an integer: ");
            System.out.println("You entered: " + integerValue);
        } catch (NonIntegerInputException e) {
            System.out.println(e.getMessage());
        }
    }
}
