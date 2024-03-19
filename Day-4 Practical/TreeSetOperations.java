import java.util.TreeSet;

public class TreeSetOperations {
    public static void main(String[] args) {
        TreeSet<Integer> arr1 = new TreeSet<>();
        arr1.add(1);
        arr1.add(3);
        arr1.add(5);
        arr1.add(7);
        arr1.add(9);
        arr1.add(11);
        arr1.add(13);

        TreeSet<Integer> arr2 = new TreeSet<>();
        arr2.add(2);
        arr2.add(3);
        arr2.add(5);
        arr2.add(7);
        arr2.add(11);
        arr2.add(13);
        arr2.add(17);
        TreeSet<Integer> difference = new TreeSet<>(arr1);
        difference.removeAll(arr2);
        System.out.println("Difference between arr1 and arr2: " + difference);
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(6);
        treeSet.add(8);
        treeSet.add(10);
        int threshold = 5;
        Integer nextHigher = treeSet.higher(threshold);
        System.out.println("Smallest element greater than " + threshold + " is: " + nextHigher);
        Integer firstElement = treeSet.pollFirst();
        Integer lastElement = treeSet.pollLast();
        System.out.println("Removed first element: " + firstElement);
        System.out.println("Removed last element: " + lastElement);
        int specificElement = 7;
        Integer floorValue = treeSet.floor(specificElement);
        Integer ceilValue = treeSet.ceiling(specificElement);
        System.out.println("Floor value of " + specificElement + " is: " + floorValue);
        System.out.println("Ceil value of " + specificElement + " is: " + ceilValue);
    }
}

