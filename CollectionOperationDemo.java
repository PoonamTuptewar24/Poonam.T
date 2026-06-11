import java.util.*;

public class CollectionOperationDemo
{
    public static void main(String args[])
    {
        HashMap<Integer,String> stud =
                new HashMap<Integer,String>();

        stud.put(101,"Amit");
        stud.put(102,"Neha");
       stud.put(103,"Rahul");

        System.out.println("Stored Data:");
        System.out.println(stud);

        System.out.println("\nRetrieved Data:");
        System.out.println("Key 102 : " + stud.get(102));

        System.out.println("\nTraversed Data:");
        for(Map.Entry<Integer,String> e : stud.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
