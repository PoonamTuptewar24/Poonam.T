import java.util.*;
public class ListInterface {
    public static void main(String args[]){
    List city = new ArrayList();
    city.add("Pune");
    city.add("Hydrabad");
    city.add("Nagpur");
    city.add("Kanpur");
    System.out.println(city);
    city.remove("Hydrabad");
    System.out.println(city);
    city.set(2,"Kanpur");
    System.out.println(city);
    city.add(2,"Nanded");
    city.add(1,"Tuljapur");
    System.out.println(city);
    Collections.sort(city);
    System.out.println(city);
}
