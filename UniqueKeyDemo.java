import java.util.*;

public class UniqueKeyDemo
{
    public static void main(String args[])
    {
        HashMap<Integer,String> stud =
                new HashMap<Integer,String>();

        stud .put(101,"Amit");
        stud .put(102,"Neha");
      stud .put(101,"Priya");

        System.out.println("Data in HashMap:");

        for(Map.Entry<Integer,String> e : stud .entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
