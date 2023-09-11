package function;

import java.util.Calendar;
import java.util.function.ToIntFunction;

public class function_task5 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        ToIntFunction<Calendar> getYearFunction = cal -> cal.get(Calendar.YEAR);

        int year = getYearFunction.applyAsInt(calendar);
        System.out.println("Год из Calendar: " + year);
    }
}
