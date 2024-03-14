public class GenericRestrictionExample<T extends Number> {
    private T value;
    public GenericRestrictionExample(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public static void main(String[] args) {
        GenericRestrictionExample<Integer> integerExample = new
                GenericRestrictionExample<>(42);
        System.out.println("Integer value: " + integerExample.getValue());
        GenericRestrictionExample<Double> doubleExample = new
                GenericRestrictionExample<>(3.14);
        System.out.println("Double value: " + doubleExample.getValue());
    }
}
