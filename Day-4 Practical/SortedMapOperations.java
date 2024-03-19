import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map;
public class SortedMapOperations {
    public static void main(String[] args) {
        SortedMap<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.put(1, "One");
        sortedMap.put(2, "Two");
        sortedMap.put(3, "Three");
        sortedMap.put(4, "Four");
        sortedMap.put(5, "Five");
        sortedMap.put(6, "Six");
        System.out.println("Original Sorted Map: " + sortedMap);
        SortedMap<Integer, String> nMinus2Keys = getNMinus2Keys(sortedMap);
        System.out.println("n-2 keys from the sorted map: " + nMinus2Keys);
        System.out.println("Size of sorted map after extracting n-2 keys: " + sortedMap.size());
        SortedMap<Integer, String> subMap = sortedMap.subMap(2, 5);
        System.out.println("Sub map with keys from 2 (inclusive) to 5 (exclusive): " + subMap);
        Map.Entry<Integer, String> firstEntry = sortedMap.pollFirstEntry();
        Map.Entry<Integer, String> lastEntry = sortedMap.pollLastEntry();
        System.out.println("Removed first entry: " + firstEntry);
        System.out.println("Removed last entry: " + lastEntry);
        System.out.println("Sorted map after removing first and last entries: " + sortedMap);
        findArmstrongNumbers(sortedMap);
    }
    public static <K, V> SortedMap<K, V> getNMinus2Keys(SortedMap<K, V> map) {
        int n = map.size();
        if (n <= 2)
            return new TreeMap<>();
        int count = 0;
        SortedMap<K, V> result = new TreeMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (count >= n - 2)
                break;
            result.put(entry.getKey(), entry.getValue());
            count++;
        }
        return result;
    }
    public static void findArmstrongNumbers(SortedMap<Integer, String> map) {
        System.out.println("Armstrong numbers present in the sorted map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int number = entry.getKey();
            int sum = 0;
            int temp = number;
            int digits = String.valueOf(number).length();
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
            if (sum == number) {
                System.out.println(number + " (" + entry.getValue() + ")");
            }
        }
    }
}
