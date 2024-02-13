import java.util.ArrayList;

public class ArrayListColl {
    public static void main(String[] args)
    {
        ArrayList<Integer> M=new ArrayList<Integer>();
        M.add(122);
        M.add(90);
        M.add(67);
        M.add(34);
        M.add(321);
        System.out.println(M);
        M.remove(3);
        System.out.println(M);

    }
}