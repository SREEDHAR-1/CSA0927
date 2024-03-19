import java.util.HashSet;
import java.util.Set;
public class SetOperations {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection of set1 and set2: " + intersection);

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union of set1 and set2: " + union);
        int threshold = 2;
        Set<Integer> subset = new HashSet<>();
        for (Integer num : union) {
            if (num > threshold) {
                subset.add(num);
            }
        }
        System.out.println("Subset containing elements greater than " + threshold + ": " + subset);
        Integer[] set1Array = set1.toArray(new Integer[0]);
        System.out.println("Elements of set1 array:");
        for (Integer num : set1Array) {
            System.out.println(num);
        }

        Integer[] set2Array = set2.toArray(new Integer[0]);
        System.out.println("Elements of set2 array:");
        for (Integer num : set2Array) {
            System.out.println(num);
        }
        Set<Integer> retainedSet = new HashSet<>(set1);
        retainedSet.retainAll(set2);
        System.out.println("Elements retained in both set1 and set2: " + retainedSet);
    }
}

