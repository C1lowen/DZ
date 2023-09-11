package predicate;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiPredicate;

public class predicate_task4 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>(Map.of(5, "World", 10, "Hello", 3, "Cat"));
        BiPredicate<Integer, String> biPredicate = (a,b) -> a != b.length();



        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            if (biPredicate.test(entry.getKey(), entry.getValue())) {
                iterator.remove();
            }
        }

        for(var key : map.keySet()){
            System.out.println(key + " ==> " + map.get(key));
        }
    }
}
