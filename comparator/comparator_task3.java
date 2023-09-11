package comparator;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class comparator_task3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(62,306,55,2000));

        Comparator<Integer> comparator = comparator_task3::compareList;

        list.sort(comparator);

        System.out.println(list);
    }


    public static int compareList(int a, int b){
        int sum1 = 0;
        int sum2 = 0;
        while(a != 0 || b != 0){
            if(a > 0){
                sum1 += a % 10;
                a /= 10;
            }
            if(b > 0){
                sum2 += b % 10;
                b /= 10;
            }
        }

        if(sum1 > sum2){
            return 1;
        }
        if(sum1 < sum2){
            return -1;
        }
        return 0;
    }
}
