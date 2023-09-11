package binaryoperator.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class task3 {
    public static void main(String[] args) {
      List<Integer> list1 = new ArrayList<>(List.of(1,-11,3,-5,5,6));
        List<Integer> list2 = new ArrayList<>(List.of(-3,2,3,4,-10,6));

        BinaryOperator<List<Integer>> binaryOperator = new SerchElementsTask3<>();


        System.out.println(binaryOperator.apply(list1, list2));
    }



}
