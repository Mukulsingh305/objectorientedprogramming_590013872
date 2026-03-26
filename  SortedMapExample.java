 import java.util.*;

  class SortedMapExample {
    public static void main(String[] args) {

        SortedMap<Integer, String> smap = new TreeMap<>();

        // ✅ Insertion
        smap.put(3, "C");
        smap.put(1, "A");
        smap.put(2, "B");

        // ✅ Update
        smap.put(2, "Updated B");

        // ✅ Searching
        System.out.println(smap.get(1));
        System.out.println(smap.containsKey(3));

        // ✅ Deletion
        smap.remove(3);

        // ✅ Traversal (Sorted Order)
        for (Map.Entry<Integer, String> entry : smap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}