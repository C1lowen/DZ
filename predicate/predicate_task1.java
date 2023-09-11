package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class predicate_task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Name", "Mama", "Lover", "Function"));

        Predicate<String> predicate = a -> a.startsWith("F");
        list.removeIf(predicate);

        System.out.println(list);
    }
}
