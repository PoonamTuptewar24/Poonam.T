import java.util.*;

public class MapDemo
{
    public static void main(String args[])
    {
        HashMap<Integer,String> stud = new HashMap<Integer,String>();

        stud.put(101,"Ana");
        stud.put(102,"Neha");
        stud.put(101,"Priya");

       System.out.println("Student with Roll No 101: "+ students.get(101));

      
        System.out.println("\nStudent Records:");
        for (Map.Entry<Integer, String> entry : stud.entrySet()) {
            System.out.println(entry.getKey() + " : " +
                    entry.getValue());
    }
}
