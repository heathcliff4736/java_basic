package java_advanced_01.day19.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest01 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Amy", "Brad", "Chandler", "David", "Eric");

        // 1. 이름 중 "A"로 시작하는 이름을 수집하여 출력하세요
        names.stream()
                .filter(t -> t.startsWith("A"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();

        List<String> filteredNames = names.stream()
                .filter(t -> t.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(filteredNames.toString());
        System.out.println();


        List<String> names2 = Arrays.asList("Alice", "Brad", "Chandler");

        // 2. 각 이름의 길이를 세어서 출력하시오 ) 결과 : [5, 4, 8]
        names2.stream()
                .mapToInt(String::length)
                .forEach(System.out::println);

    }
}
