import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionalInterfacesDemo {

    public static void main(String[] args) {

        // Predicate Interface
        Predicate<Integer> p = n -> n > 18;
        System.out.println("Is 20 greater than 18? " + p.test(20));

        // Supplier Interface
        Supplier<String> s = () -> "Welcome to Java Functional Interfaces";
        System.out.println("Supplier Output: " + s.get());

        // Consumer Interface
        Consumer<String> c = name -> System.out.println("Hello " + name);
        c.accept("Poonam");

        // Function Interface
        Function<Integer, Integer>f=n -> n*n;
        System.out.println("Square of 5 ="+f.apply(5));
    }
}
