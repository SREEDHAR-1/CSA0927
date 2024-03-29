interface Tree {
    void fruits(String fruit1, String fruit2);
    void leaves(String leaf1, String leaf2, String leaf3);
    void flowers(String flower1, String flower2, String flower3, String flower4);
}
class Branch1 implements Tree {
    @Override
    public void fruits(String fruit1, String fruit2) {
        System.out.println("Fruits on Branch1: " + fruit1 + ", " + fruit2);
    }
    @Override
    public void leaves(String leaf1, String leaf2, String leaf3) {
        System.out.println("Leaves on Branch1: " + leaf1 + ", " + leaf2 + ", " + leaf3);
    }
    @Override
    public void flowers(String flower1, String flower2, String flower3, String flower4) {
        System.out.println("Flowers on Branch1: " + flower1 + ", " + flower2 + ", " + flower3
                + ", " + flower4);
    }
}
class Branch2 implements Tree {
    @Override
    public void fruits(String fruit1, String fruit2) {
        System.out.println("Fruits on Branch2: " + fruit1 + ", " + fruit2);
    }
    @Override
    public void leaves(String leaf1, String leaf2, String leaf3) {
        System.out.println("Leaves on Branch2: " + leaf1 + ", " + leaf2 + ", " + leaf3);
    }
    @Override
    public void flowers(String flower1, String flower2, String flower3, String flower4) {
        System.out.println("Flowers on Branch2: " + flower1 + ", " + flower2 + ", " + flower3
                + ", " + flower4);
    }
}
public class TreeInterface {
    public static void main(String[] args) {
        Branch1 branch1 = new Branch1();
        Branch2 branch2 = new Branch2();
        branch1.fruits("Apple", "Orange");
        branch1.leaves("Green", "Yellow", "Red");
        branch1.flowers("Rose", "Lily", "Daisy", "Sunflower");
        branch2.fruits("Mango", "Banana");
        branch2.leaves("Brown", "Orange", "Purple");
        branch2.flowers("Tulip", "Daffodil", "Hibiscus", "Cherry Blossom");
    }
}