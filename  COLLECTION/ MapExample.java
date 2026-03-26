 import java.util.*;

  class MapExample {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        // ✅ Insertion
        map.put(1, "Mukul");
        map.put(2, "Aman");

        // ✅ Update
        map.put(1, "Rahul"); // replaces Mukul

        // ✅ Searching
        System.out.println(map.containsKey(2)); // true
        System.out.println(map.get(1)); // Rahul

        // ✅ Deletion
        map.remove(2);

        // ✅ Traversal
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}