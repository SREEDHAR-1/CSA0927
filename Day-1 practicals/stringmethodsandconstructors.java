public class stringmethodsandconstructors {
    public static void main(String[] args) {
        String str1 = "sreedhar";
        String str2 = "saveetha";
        String str3 = "college";
        System.out.println("More String constructors:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        String originalString = "Java Programming is Fun";
        System.out.println("\nMore String methods:");
        boolean startsWith = originalString.startsWith("Java");
        System.out.println("Starts with 'Java': " + startsWith);
        boolean endsWith = originalString.endsWith("Fun");
        System.out.println("Ends with 'Fun': " + endsWith);
        boolean contains = originalString.contains("Programming");
        System.out.println("Contains 'Programming': " + contains);
        boolean isEmpty = originalString.isEmpty();
        System.out.println("Is empty: " + isEmpty);
        String[] parts = originalString.split(" ");
        System.out.println("Split string:");
        for (String part : parts) {
            System.out.println(part);
        }
        String joinedString = String.join(" - ", "Java", "Programming", "is", "Fun");
        System.out.println("Joined string: " + joinedString);
        int compareResult = originalString.compareTo("Java Programming is Awesome");
        System.out.println("Compare result: " + compareResult);
        String substringFromIndex = originalString.substring(5);
        System.out.println("Substring from index 5: " + substringFromIndex);
        String substringRange = originalString.substring(5, 16);
        System.out.println("Substring from index 5 to 16: " + substringRange);
        char[] charArray = originalString.toCharArray();
        System.out.println("Character array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}