
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CreatingHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> super1 = new HashMap<>();
        super1.put("Apple", 10);
        super1.put("Banana", 20);
        super1.put("Cherry", 30);
        super1.put("Date", 40);
        super1.put("Fig", 50);

        HashMap<String, Integer> super2 = new HashMap<>();
        super2.put("Blueberry", 60);
        super2.put("Blackberry", 70);
        super2.put("Grapes", 80);
        super2.put("Kiwi", 90);
        super2.put("Mango", 100);
        removeKeysStartingWithB(super1);
        removeKeysStartingWithB(super2);
        System.out.println("Super1 after removing keys starting with 'B': " + super1);
        System.out.println("Super2 after removing keys starting with 'B': " + super2);
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 10);
        hashMap.put("B", 20);
        hashMap.put("C", 30);
        hashMap.put("D", 40);
        hashMap.put("E", 50);
        displayKeysForValueProductOf10(hashMap);
        iterateOverEntries(hashMap);
        computeValueForKeyC(hashMap);
        System.out.println("HashMap after computing value for key 'C': " + hashMap);
    }
    public static void removeKeysStartingWithB(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getKey().startsWith("B")) {
                iterator.remove();
            }
        }
    }
    public static void displayKeysForValueProductOf10(HashMap<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 10 == 0) {
                System.out.println("Key for value " + entry.getValue() + ": " + entry.getKey());
            }
        }
    }
    public static void iterateOverEntries(HashMap<String, Integer> map) {
        System.out.println("Entries in the hash map:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
    public static void computeValueForKeyC(HashMap<String, Integer> map) {
        map.computeIfAbsent("C", key -> 70); // Assuming 70 is the computed value for key "C"
    }
}
