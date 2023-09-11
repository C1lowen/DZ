package unaryoperator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class unary_task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8));

        UnaryOperator<Integer> unaryOperator = a ->{
            if(a % 2 != 0) return 0;

            return a;
        };

        list.replaceAll(unaryOperator);

        System.out.println(list);
    }
}
