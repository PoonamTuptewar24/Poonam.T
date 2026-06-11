import java.util.*;

public class TreeMapDemo
{
    public static void main(String args[])
    {
        TreeMap<Integer,String> stud =
                new TreeMap<Integer,String>();

        stud.put(103,"Rahul");
        stud.put(101,"Amit");
        stud.put(102,"Neha");

        System.out.println("TreeMap Data:");

        for(Map.Entry<Integer,String> e : stud.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
