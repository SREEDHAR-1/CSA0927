import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetColl {
    public static void main(String[] args)
    {
        SortedSet<String> M = new TreeSet<String>();
        M.add("Sreedhar");
        M.add("192221088");
        M.add("Saveetha");
        System.out.println(M);
        M.remove("192221088");
        System.out.println(M);

        SortedSet<Integer> L = new TreeSet<Integer>();
        L.add(600);
        L.add(676);
        L.add(997);
        System.out.println(L);
        L.remove(100);
        System.out.println(L);

    }
}
