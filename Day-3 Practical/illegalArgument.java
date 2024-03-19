public class illegalArgument {
    public static void main(String[] args) {
        try {
            int radius = -5;
            calculateArea(radius);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: Negative Argument in the method requiring non-negative values");
        }

        try {
            String color = "Purple";
            setColor(Color.valueOf(color.toUpperCase()));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: Invalid Enum Constant Passed to a Method");
        }

        try {
            int age = 150;
            setAge(age);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: Setting an Invalid Range for a Method Parameter");
        }

        try {
            String name = "";
            setName(name);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: Empty or Null String Argument in a Method Requiring");
        }
    }

    private static void calculateArea(int radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
    }

    private enum Color {
        RED, GREEN, BLUE
    }

    private static void setColor(Color color) {
    }

    private static void setAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120");
        }
    }

    private static void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty or null");
        }
    }
}

