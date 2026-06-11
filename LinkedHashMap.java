import java.util.*;

public class LinkedHashMap
{
    public static void main(String args[])
    {
        LinkedHashMap<Integer,String> stud =  new LinkedHashMap<Integer,String>();

        stud.put(103,"Rahul");
        stud.put(101,"Amit");
        stud.put(102,"Neha");

        System.out.println("LinkedHashMap Data:");

        for(Map.Entry<Integer,String> e : stud.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
