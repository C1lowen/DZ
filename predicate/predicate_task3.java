package predicate;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class predicate_task3 {
    public static void main(String[] args) {
        List<Cat> list = new ArrayList<>(List.of(new Cat("Umka", 12),
                new Cat("Luska", 3),
                new Cat("Timka", 2),
                new Cat("Barsic", 10)));

        predicateAnswer(list, 'c', 13);

        System.out.println(list);
    }

    public static void predicateAnswer(List<Cat> list, char firstChar, int age){
        Predicate<Cat> predicate1 = a ->  a.getAge() < age;
        Predicate<Cat> predicate2 = a -> a.getName().toLowerCase().charAt(0) > firstChar;

        list.removeIf(predicate1.and(predicate2));
    }
}
