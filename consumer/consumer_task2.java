package consumer;

import java.util.Map;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class consumer_task2 {
    public static void main(String[] args) {
        Consumer<String> consumer = a -> {
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(a);

            if(matcher.find()){
                System.out.println(a);
            }
        };

        consumer.accept("Hello");
        consumer.accept("Hell30756");
        consumer.accept("345");
        consumer.accept("2Hello");
    }
}
