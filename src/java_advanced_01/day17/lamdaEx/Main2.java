package java_advanced_01.day17.lamdaEx;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // 함수형 인터페이스를 사용한 람다식 표현 방법
        List<String> filteredNames = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println(filteredNames);

        UnaryOperator<Integer> square = x -> x * x;
        BiFunction<Integer, Integer, Integer> squareFunction = (x, y) -> x * y;
        Runnable run = () -> System.out.println("Hello!!");

    }
}
