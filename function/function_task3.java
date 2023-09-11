package function;

import java.util.function.Function;

public class function_task3 {
    public static void main(String[] args) {


        Function<String, Character[]> fun1 = s -> {
            Character[] charArray = new Character[s.length()];
            for (int i = 0; i < s.length(); i++) {
                charArray[i] = s.charAt(i);
            }
            return charArray;
        };
        Function<Character[], Integer> fun2 = s -> {
            int sum = 0;
            for(int i = 0; i < s.length; i++){
                sum += s[i];
            }
            return sum;
        };

        Function<String, Integer> fun3 = fun1.andThen(fun2);

        System.out.println(fun3.apply("abc"));

    }
}
