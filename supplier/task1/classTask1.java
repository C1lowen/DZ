package supplier.task1;

import java.util.function.Supplier;

public class classTask1 implements Supplier<String> {

    private String str;

    public classTask1(String str) {
        this.str = str;
    }

    @Override
    public String get() {
        return str.split(" ")[0];
    }
}
