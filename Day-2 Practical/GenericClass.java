class Box<T> {
    private T value;
    public Box(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(42);
        Box<String> stringBox = new Box<>("Hello, Generics!");
        System.out.println("Integer Box Value: " + integerBox.getValue());
        System.out.println("String Box Value: " + stringBox.getValue());
        integerBox.setValue(99);
        stringBox.setValue("Updated Value");
        System.out.println("Updated Integer Box Value: " + integerBox.getValue());
        System.out.println("Updated String Box Value: " + stringBox.getValue());
    }
}