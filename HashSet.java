import java.util.*;

class HashSetDemo
{
    public static void main(String args[])
    {
        HashSet hs = new HashSet<>();
        hs.add("Pune");
        hs.add("Mumbai");
        hs.add("Nagpur");
        hs.add("Pune");
        hs.add("Nashik");

        System.out.println("HashSet Elements:");
        System.out.println(hs);

        hs.remove("Nashik");
        hs.remove("Mumbai");
        System.out.println(hs);
      
    }
}
