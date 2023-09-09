package supplier.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>(List.of("Hello", "world", "Java"));

        Predicate<String> predicate = a -> Character.isUpperCase(a.charAt(0));

        Supplier <String> supplier = new SupClass(list, predicate);

        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());


    }
}
