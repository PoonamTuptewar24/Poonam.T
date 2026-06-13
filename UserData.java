import java.util.*;

class UserData
{
    public static void main(String args[])
    {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Amiya");
        list.add("Rakhi");
        list.add("Priya");

        //Iterator
        System.out.println("Using Iterator");

        Iterator<String> it = list.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
      
        //ListIterator
        System.out.println("Using ListIterator");

        ListIterator<String> lit = list.listIterator();

        while(lit.hasNext())
        {
            System.out.println(lit.next());
        }
    }
}
