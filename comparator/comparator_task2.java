package comparator;

import java.util.*;
import java.util.function.Function;

public class comparator_task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(-32,-5,5,12));

        Comparator<Integer> comparator = (a,b) -> {
            if(Math.abs(a) > Math.abs(b) ){
                return 1;
            }
            if(Math.abs(a) < Math.abs(b) ){
                return -1;
            }

            if(a > b){
                return 1;
            }
            if(a < b) {
               return -1;
            }

            return 0;
        };


        Integer minElem = Collections.min(list, comparator);

        if(minElem < 0) minElem *= -1;

        System.out.println(list + " ==> " + minElem);
    }
}
