package java_advanced_01.day19.sortedEx;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// 스트림 내에서 요소를 오름차순 정렬 (자연순서 - nature ordering) 또는 사용자 정의 비교기에 따라 정렬될 수 있다.
public class SortedEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "신세계", "김윤진", "정현주", "남기주"
        );

        // 2. 자연순으로 정렬하여 이름을 출력하세요
        List<String> sortedNames =
                names.stream()
                        .sorted()
                        .collect(Collectors.toList());
        System.out.println(sortedNames);
        System.out.println();

        names.stream()
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();

        Collections.sort(names);
        System.out.println(names);

        // 3. 내림차순 정렬            .sorted(Comparator.reverseOrder())
        List<String> sortedNames1 =
                names.stream()
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList());
        System.out.println(sortedNames1);
        System.out.println();


        // 4. 중간 연산 체이닝
        List<String> names2 = Arrays.asList("Alice", "Brad", "Chandler", "David", "Eric", "Daniel");

        // names2의 이름 중 "D"로 시작하는 이름을 대문자로 모두 바꾸어, 자연정렬하여 출력하시오.
        names2.stream()
                .filter(t->t.startsWith("D"))
                .map(String::toUpperCase)
                .sorted().toList()
                .forEach(System.out::println);
    }
}
