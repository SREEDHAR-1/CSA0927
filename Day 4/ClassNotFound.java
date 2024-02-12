public class ClassNotFound {
    public static void main(String[] args) {
        try {
            Class.forName("mohini");
        } catch (ClassNotFoundException e) {
            System.out.println("there is an exception"+e);
        }
    }
}