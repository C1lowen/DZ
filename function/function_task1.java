package function;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class function_task1 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{5,6,7,8,9,10,11,12,13,17};
        Function<Integer[], Integer> fun1 = function_task1::transformation;
        System.out.println(Arrays.toString(arr) + " ==> "+ fun1.apply(arr));

    }

    public static Integer transformation(Integer[] number){
        Predicate<Integer> predicate = function_task1::predicate;
        int count = 0;
        for(int i = 0; i < number.length; i++){
            if(predicate.test(number[i])){
                count++;
            }
        }
        return count;
    }

    public static boolean predicate (Integer number){

        if (number <= 1) {
            return false;
        }

        if (number <= 3) {
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int j = 5; j * j <= number; j += 6) {
            if (number % j == 0 || number % (j + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
