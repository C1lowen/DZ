package predicate;


import java.util.function.IntPredicate;


public class predicate_task5 {
    public static void main(String[] args) {


        IntPredicate predicate = predicate_task5::parityСheck;

        System.out.println(predicate.test(104));
    }

    public static boolean parityСheck(int number){
        int sum = 0;

        while (number != 0){
            sum += number % 10;
            number /= 10;
        }

        return (sum % 2) == 0 ? true : false;
    }
}
