package unaryoperator;

import java.util.function.UnaryOperator;

public class unary_task2 {
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = a -> a.replaceAll("[^0-9]", "");

        System.out.println(unaryOperator.apply("fsdfsd423fsd"));
        System.out.println(unaryOperator.apply("312312ff"));
        System.out.println( unaryOperator.apply("sdffsdfd"));

    }
}
