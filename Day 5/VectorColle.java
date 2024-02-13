import java.util.Vector;

public class VectorColle {

    public static void main(String[] args)
    {
        Vector<String> G=new Vector<>();
        G.add("A");
        G.add("B");
        G.add("D");
        //G.add(9,"We");
        System.out.println(G);
        G.remove("M");
        System.out.println(G);
    }
}