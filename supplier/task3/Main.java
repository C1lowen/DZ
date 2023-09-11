package supplier.task3;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
        IntSupplier supplier = new ElementsMassive(arr);

        for(int i = 0; i < 10; i++){
            System.out.println(supplier.getAsInt());
        }
    }


}
