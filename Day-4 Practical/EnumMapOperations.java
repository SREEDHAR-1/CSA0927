import java.util.EnumMap;
import java.util.Map;
import java.util.EnumSet;
enum Sports {
    CRICKET, FOOTBALL, TENNIS, HANDBALL, BASKETBALL
}
public class EnumMapOperations {
    public static void main(String[] args) {
        EnumMap<Sports, String> BAT = new EnumMap<>(Sports.class);
        BAT.put(Sports.CRICKET, "Batsman");
        BAT.put(Sports.FOOTBALL, "Striker");
        BAT.put(Sports.TENNIS, "Server");
        System.out.println("Original EnumMap: " + BAT);
        if (!BAT.containsKey(Sports.HANDBALL)) {
            BAT.clear();
        }
        System.out.println("EnumMap after checking and possibly clearing: " + BAT);
        EnumMap<Sports, String> clonedMap = BAT.clone();
        System.out.println("Cloned EnumMap: " + clonedMap);
        System.out.println("Original EnumMap: " + BAT);
        if (BAT.containsKey(Sports.CRICKET)) {
            System.out.println("The map contains a mapping for CRICKET.");
        } else {
            EnumMap<Sports, String> TRIO = new EnumMap<>(Sports.class);
            TRIO.put(Sports.CRICKET, "First");
            TRIO.put(Sports.FOOTBALL, "Second");
            TRIO.put(Sports.TENNIS, "Third");
            BAT.putAll(TRIO);
            System.out.println("Replaced value with TRIO: " + BAT);
        }
        EnumMap<Sports, Integer> valuesMap = new EnumMap<>(Sports.class);
        valuesMap.put(Sports.CRICKET, 2);
        valuesMap.put(Sports.FOOTBALL, 3);
        valuesMap.put(Sports.TENNIS, 4);
        valuesMap.put(Sports.HANDBALL, 5);
        valuesMap.put(Sports.BASKETBALL, 6);
        int primeCount = countPrimePairs(valuesMap);
        System.out.println("Number of prime key-value pairs present: " + primeCount);
    }
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    private static int countPrimePairs(EnumMap<Sports, Integer> map) {
        int count = 0;
        for (Map.Entry<Sports, Integer> entry : map.entrySet()) {
            if (isPrime(entry.getValue())) {
                count++;
            }
        }
        return count;
    }
}
