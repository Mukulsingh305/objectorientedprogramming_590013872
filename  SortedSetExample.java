 import java.util.*;

  class SortedSetExample {
    public static void main(String[] args) {

        SortedSet<Integer> sset = new TreeSet<>();

        // ✅ Insertion
        sset.add(30);
        sset.add(10);
        sset.add(20);

        // ❗ Update = remove + add
        sset.remove(20);
        sset.add(25);

        // ✅ Searching
        System.out.println(sset.contains(10));

        // ✅ Deletion
        sset.remove(30);

        // ✅ Traversal (Sorted)
        for (int num : sset) {
            System.out.println(num);
        }
    }
}