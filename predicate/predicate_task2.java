package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class predicate_task2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Name", "Mama", "Lover", "Function"));

        Predicate<String> predicate = predicate_task2::predicateCheck;

        list.removeIf(predicate);

        System.out.println(list);
    }


    public static boolean predicateCheck(String str){
        char[] arr = new char[]{'n', 'l', 't'};
        str = str.toLowerCase();
        for(int i = 0; i < arr.length; i++){
           if(str.startsWith(String.valueOf(arr[i]))){
               return true;
           }
        }
        return false;
    }
}
