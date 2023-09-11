package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparator_task4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(2, -12, 5, -7, 12, -13, 27));

        Comparator<Integer> comparator = (a,b) -> {
            boolean first = isPrime(a);
            boolean second = isPrime(b);

            if(first && second){
                if(a > b){
                    return 1;
                }
                if(a < b) {
                    return -1;
                }
                return 0;
            }

            if(first || second){
                if(first) return 1;
                if(second) return -1;
            }

            if(a < b){
                return 1;
            }
            if(a > b) {
                return -1;
            }

            return 0;
        };


        Integer max = Collections.max(list,comparator);

        System.out.println(list + " ==> " + max);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Число 1 и меньше не считается простым
        }
        if (number <= 3) {
            return true; // Числа 2 и 3 считаются простыми
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false; // Числа, кратные 2 или 3, не считаются простыми
        }

        // Проверяем делители, начиная с 5
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false; // Если число делится на i или (i + 2), то оно не простое
            }
        }

        return true; // Если не найдено делителей, то число простое
    }
}
