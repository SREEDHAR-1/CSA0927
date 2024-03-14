public class InVokingAnotherConstructor {
    private int number;
    private String text;
    // Constructor with two parameters
    public InVokingAnotherConstructor(int number, String text) {
        this.number = number;
        this.text = text;
    }
    public InVokingAnotherConstructor(int number) {
        this(number, "Default Text");
    }
    public void displayValues() {
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }
    public static void main(String[] args) {
        InVokingAnotherConstructor obj1 = new InVokingAnotherConstructor(42, "Hello,World!");
        obj1.displayValues();
        InVokingAnotherConstructor obj2 = new InVokingAnotherConstructor(17);
        obj2.displayValues();
    }
}
