import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;
public class HashSetOperations {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(2);
        hashSet2.add(3);
        hashSet2.add(1);
        System.out.println("HashSet1: " + hashSet1);
        System.out.println("HashSet2: " + hashSet2);
        System.out.println("HashSet1 equals HashSet2: " + hashSet1.equals(hashSet2));
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("cherry");
        HashSet<String> hashSetFromArrayList = new HashSet<>(arrayList);
        System.out.println("HashSet from ArrayList: " + hashSetFromArrayList);
        String elementToCheck = "banana";
        if (!hashSetFromArrayList.contains(elementToCheck)) {
            hashSetFromArrayList.add(elementToCheck);
        }
        System.out.println("HashSet after appending if not present: " + hashSetFromArrayList);
        HashSet<String> cloneSet = new HashSet<>(hashSetFromArrayList);
        System.out.println("Clone set: " + cloneSet);
        Set<HashSet<String>> hashSets = new HashSet<>();
        hashSets.add(hashSetFromArrayList);
        hashSets.add(cloneSet);
        System.out.println("HashSet collection: " + hashSets);
    }
}

