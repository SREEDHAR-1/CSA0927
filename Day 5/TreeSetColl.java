import java.util.Set;
import java.util.TreeSet;

public class TreeSetColl {
    public static void main(String[] args)
    {
        Set<String> L=new TreeSet<String>();
        L.add("sreedhar");
        L.add("saveetha");
        L.add("192221088");
        System.out.println(L);
        L.remove("DEF");
        System.out.println(L);

    }
}