package supplier.task1;

import java.util.function.Supplier;

public class task1 {
    public static void main(String[] args) {
        Supplier<String> supplier = new classTask1("Привет как дела?");

        System.out.println(supplier.get());
    }
}
