package supplier.task2;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupClass implements Supplier<String> {
    private List<String> list;
    private Predicate<String> predicate;

    private int index;

    public SupClass(List<String> list, Predicate<String> predicate) {
        this.list = list;
        this.predicate = predicate;
        this.index = 0;
    }

    @Override
    public String get() {
        for(String str : list){
            if(predicate.test(str)){
                list.remove(str);
                return str;
            }
        }
        return null;
    }
}
