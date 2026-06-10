import java.util.*;

class LinkedHashSetDemo
{
    public static void main(String args[])
    {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();

        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(10);
        lhs.add(40);
        lhs.add(20);

        System.out.println("LinkedHashSet Elements:");
        System.out.println(lhs);
    }
}
