 import java.util.*;

  class SetDemo  {
    public static void main(String[] args) {

        java.util.Set<String> set = new HashSet<>();

         
        set.add("Apple");
        set.add("Banana");

 
        set.remove("Apple");
        set.add("Mango");

      
        System.out.println(set.contains("Banana"));

 
        set.remove("Banana");

 
        for (String item : set) {
            System.out.println(item);
        }
    }
}
