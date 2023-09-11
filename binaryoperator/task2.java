package binaryoperator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class task2 {
    public static void main(String[] args) {
        BinaryOperator<List<Integer>> binaryOperator = task2::checkNewElements;

        List<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5));
        List<Integer> list2 = new ArrayList<>(List.of(0,2,5,6,7));

        System.out.println(binaryOperator.apply(list1, list2));
    }


    public static <T> List<T> checkNewElements(List<T> list1, List<T> list2){
        List<T> listResult = new ArrayList<>();
        for(T str : list1){
            if(list2.contains(str)){
                listResult.add(str);
            }
        }
        return listResult;
    }
}
