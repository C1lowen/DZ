package unaryoperator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class unary_task3 {
    public static void main(String[] args) {


        Predicate<String> predicate = a -> a.length() < 5;

        UnaryOperator<List<String>> unaryOperator = a ->{
            a.removeIf(predicate);
            return a;
        };

        System.out.println(unaryOperator.apply(new ArrayList<>(List.of("Hello", "Hell65o", "Hello6775676","Hel"))));


    }
}
