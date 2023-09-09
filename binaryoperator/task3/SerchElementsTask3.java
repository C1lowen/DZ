package binaryoperator.task3;

import java.util.List;
import java.util.function.BinaryOperator;

public class SerchElementsTask3<T extends Comparable<T>> implements BinaryOperator<List<T>> {



    @Override
    public List<T> apply(List<T> list1, List<T> list2) {
        if (list1 == null || list2 == null || list1.isEmpty() && list2.isEmpty()) {
            return null; 
        }

        T min1 = getMinimum(list1);
        T min2 = getMinimum(list2);

        if (min1 == null && min2 == null) {
            return null;
        } else if (min1 == null) {
            return list2;
        } else if (min2 == null) {
            return list1;
        } else {
            return min1.compareTo(min2) <= 0 ? list1 : list2;
        }
    }

    private T getMinimum(List<T> list) {
        T min = list.get(0);
        for (T element : list) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }
}
