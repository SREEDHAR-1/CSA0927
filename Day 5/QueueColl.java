import java.util.LinkedList;
import java.util.Queue;

public class QueueColl {
    public static void main(String[] args)
    {
        Queue<Integer> B= new LinkedList<Integer>();
        B.add(18);
        B.add(20);
        B.add(23);
        B.add(15);
        B.add(17);
        System.out.println(B);
        B.remove(20);
        System.out.println(B);
        Integer Front= B.remove();
        System.out.println(B);
        boolean Back=B.add(44);
        System.out.println(B);

    }
}