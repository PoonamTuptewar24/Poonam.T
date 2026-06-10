import java.util.*;

class TreeSetDemo
{
    public static void main(String args[])
    {
        TreeSet ts = new TreeSet<>();
        ts.add(50);
        ts.add(20);
        ts.add(40);
        ts.add(10);
        ts.add(30);
        ts.add(20);

        System.out.println("TreeSet Elements:");
        System.out.println(ts);
    }
}
