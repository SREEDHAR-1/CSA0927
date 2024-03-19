import java.io.*;
import java.util.EnumSet;

enum Color {
    RED, GREEN, BLUE, YELLOW, ORANGE;
}

public class EnumSetOperations {
    public static void main(String[] args) {
        EnumSet<Color> originalSet = EnumSet.of(Color.RED, Color.GREEN, Color.BLUE);
        try {
            FileOutputStream fileOut = new FileOutputStream("enumSet.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(originalSet);
            out.close();
            fileOut.close();
            System.out.println("Original EnumSet serialized successfully.");
        } catch (IOException i) {
            i.printStackTrace();
        }
        EnumSet<Color> deserializedSet = null;
        try {
            FileInputStream fileIn = new FileInputStream("enumSet.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            deserializedSet = (EnumSet<Color>) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Original EnumSet deserialized successfully.");
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("EnumSet class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized EnumSet: " + deserializedSet);
    }
}
