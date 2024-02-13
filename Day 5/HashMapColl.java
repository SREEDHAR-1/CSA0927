import java.util.HashMap;

public class HashMapColl {
    public static void main(String[] args){
        HashMap<String,Integer> L=new HashMap<String,Integer>();
        L.put("Sreedhar",23);
        L.put("virat",18);
        L.put("Ab de villiers",17);
        System.out.println("size of map:"+L.size());
        System.out.println(L);
        L.remove("Deepu",21);
        System.out.println(L);
    }
}
