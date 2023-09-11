package comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class comparator_task1 {
    public static void main(String[] args) {
        Cat[] cats = new Cat[]{new Cat("Umka",12),
                new Cat("Barsik",23),
                new Cat("Marsik",5),
                new Cat("Valek",3) };

        Comparator<Cat> comparator = (a,b) -> a.getName().length() - b.getName().length();

        Arrays.sort(cats, comparator);

        System.out.println(Arrays.toString(cats));
    }
}
