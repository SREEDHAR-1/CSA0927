import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        try {
            String nonNumericString = "abc";
            int parsedInt = Integer.parseInt(nonNumericString);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: Parsing a Non-Numeric String");
        }

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number:");
            String userInput = scanner.nextLine();
            int parsedInput = Integer.parseInt(userInput);
            System.out.println("Parsed input: " + parsedInput);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: Reading User Input Without Validation");
        }

        try {
            DecimalFormat df = new DecimalFormat("#,##0.00");
            String formattedNumber = df.format(1234.56);
            System.out.println("Formatted number: " + formattedNumber);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: Formatting Issues in “Decimal Format”");
        }

        try {
            String numberString = "1,234.56";
            NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
            double parsedNumber = numberFormat.parse(numberString).doubleValue();
            System.out.println("Parsed number: " + parsedNumber);
        } catch (ParseException | NumberFormatException e) {
            System.out.println("Caught NumberFormatException: Incorrectly using localized decimal separators");
        }
    }
}
