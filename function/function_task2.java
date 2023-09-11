package function;

import java.util.function.Function;

public class function_task2 {
    public static void main(String[] args) {
        String str = "Привет мир";
        Function<String, Integer> fun = function_task2::consonants;
        System.out.println(str + " ==> " + fun.apply(str));

    }

    public static Integer consonants(String str){
        char[] arraysConsonants = new char[]{'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'};
        int count = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < arraysConsonants.length; j++){
                if(str.charAt(i) == arraysConsonants[j]) count++;
            }
        }
        return count;
    }
}
