package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class function_task4 {
    public static void main(String[] args) {
        BiFunction<String, String, String[]> biFunction = function_task4::similarWords;
        System.out.println(Arrays.toString(biFunction.apply("Hello Worsd", "Hello World Worsd")));
    }


    public static String[] similarWords(String str1, String str2){
        if(str1 == null || str2 == null) return null;

        String[] str1Arrays = str1.split(" ");
        String[] str2Arrays = str2.split(" ");

        List<String> commonStrings = new ArrayList<>();

        int minLength = Math.min(str1Arrays.length, str2Arrays.length);

        for (int i = 0; i < minLength; i++) {
            if (str1Arrays[i].equals(str2Arrays[i])) {
                commonStrings.add(str1Arrays[i]);
            }
        }

        return commonStrings.toArray(new String[0]);
    }
}
