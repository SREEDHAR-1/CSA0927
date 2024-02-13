import java.util.Stack;

public class StackColle {
    public static void main(String[] args){
        Stack<Integer> S = new Stack<>();
        S.push(5);
        S.push(6);
        S.push(7);
        S.push(8);
        System.out.println(S);
        System.out.println("Popped element: "
                + S.pop());
        System.out.println("Popped element: "
                + S.pop());

        // Displaying the Stack after pop operation
        System.out.println("Stack after pop operation "
                + S);
    }
}