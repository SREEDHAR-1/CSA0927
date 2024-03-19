import java.util.TreeMap;
import java.util.Map;

public class TreeMapOperations{
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 20);
        treeMap.put("Cherry", 30);
        treeMap.put("Date", 40);
        treeMap.put("Fig", 50);
        System.out.println("Original TreeMap: " + treeMap);
        Map.Entry<String, Integer> firstEntry = treeMap.pollFirstEntry();
        System.out.println("Removed first entry: " + firstEntry.getKey() + " - " + firstEntry.getValue());
        int count = treeMap.size() - 1;
        for (int i = 0; i < count; i++) {
            Map.Entry<String, Integer> entry = treeMap.pollLastEntry();
            System.out.println("Removed entry: " + entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("TreeMap after removing first and n-1 entries: " + treeMap);
        TreeMap<Integer, String> emptyTreeMap = new TreeMap<>();
        System.out.println("Empty TreeMap: " + emptyTreeMap);
        TreeMap<String, Integer> subMap = new TreeMap<>(treeMap.subMap("A", true, "D", true));
        System.out.println("SubMap from 'A' to 'D': " + subMap);
        TreeMap<String, Integer> portionMap = new TreeMap<>(treeMap.headMap("C", true));
        System.out.println("Portion of the map with keys strictly less than 'C': " + portionMap);
        TreeMap<String, Integer> viewMap = new TreeMap<>(treeMap.tailMap("C", true));
        System.out.println("View of the map with keys greater than or equal to 'C': " + viewMap);
    }
}
