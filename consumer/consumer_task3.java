package consumer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class consumer_task3 {
    public static void main(String[] args) {

        BiConsumer<String, File> biConsumer = consumer_task3::consumer;

        biConsumer.accept("Как дела?", new File("t.txt"));

    }

    public static void consumer(String str, File file)  {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            bw.write(str);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
