package binaryoperator;

import java.util.function.BinaryOperator;

public class task1 {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperatory = (a,b) -> (a.length() > b.length()) ? a : b;

        System.out.println(binaryOperatory.apply("Привет", "Соня"));

    }
}
