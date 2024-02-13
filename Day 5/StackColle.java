import java.util.Stack;

public class StackColle {
    public static void main(String[] args)
    {
        Stack<String> J=new Stack<>();
        J.push("17");
        J.push("23");
        J.push("18");
        J.push("33");
        System.out.println(J);
        String narnedra = J.pop();
        System.out.println(J);
        J.remove(2);
        System.out.println(J);
    }
}