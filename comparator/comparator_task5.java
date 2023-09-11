package comparator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class comparator_task5 {
    public static void main(String[] args) {
        List< File> list = new ArrayList<>(List.of(
                new File("D:\\test_comparator\\test1.txt"),
                new File("D:\\test_comparator\\test2.txt"),
                new File("D:\\test_comparator\\test3.txt")));

        Comparator<File> comparator = comparator_task5::compareFile;

        System.out.println(list);

        list.sort(comparator);

        System.out.println(list);

    }

    public static int compareFile(File file1, File file2){
        int counter1 = countZnak(file1);
        int counter2 = countZnak(file2);

        if(counter1 > counter2){
            return 1;
        }
        if(counter1 < counter2){
            return -1;
        }
        return 0;
    }
    public static int countZnak(File file){
        int count = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line = br.readLine();
            while(line != null){
                count += line.replaceAll("[^\\p{Punct}]", "").length();
                count += line.split(" ").length - 1;
                line = br.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        return count;
    }
}
