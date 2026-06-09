import java.util.*;
public class PolymorphicJCF {
  public static void display(Collection<String> c) {
    for (String item : c) {
        System.out.println(item);
    }
}
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        Collection<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");

        System.out.println("ArrayList Elements:");
        display(list);

        System.out.println("\nHashSet Elements:");
        display(set);
    }
}
