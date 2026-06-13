import java.util.*;

class SortShuffle
{
    public static void main(String args[])
    {
        ArrayList<> list = new ArrayList<>();

        list.add("Rahul");
        list.add("Amit");
        list.add("Priya");

         //Sorting
        Collections.sort(list);
        System.out.println("After Sorting");
        System.out.println(list);

       //Shuffling
        Collections.shuffle(list);
        System.out.println("After Shuffling");
        System.out.println(list);
    }
}
