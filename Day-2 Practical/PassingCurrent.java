public class PassingCurrent {
    private int number;
    public PassingCurrent(int number) {
        this.number = number;
    }
    public void processData(PassingCurrent anotherObject) {
        int sum = this.number + anotherObject.number;
        System.out.println("Sum: " + sum);
    }
    public static void main(String[] args) {
        PassingCurrent obj1 = new
                PassingCurrent(30);
        PassingCurrent obj2 = new
                PassingCurrent(15);
        obj1.processData(obj2);
    }
}
