package supplier.task3;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class ElementsMassive implements IntSupplier {
    private int[] arr;

    private int index;

    public ElementsMassive(int[] arr) {
        this.arr = arr;
        this.index = 0;
    }

    @Override
    public int getAsInt() {
        int result = arr[index];
        index++;
        return result;
    }


}
