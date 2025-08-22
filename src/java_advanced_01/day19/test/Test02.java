package java_advanced_01.day19.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test02 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 1. 짝수 필터링
        List<Integer> evenNumber =
                list.stream()
                        .filter(integer -> integer % 2 == 0)
                        .collect(Collectors.toList());
        System.out.println(evenNumber);
        System.out.println();

        // 2. map연산으로 제곱
        List<Integer> square =
                list.stream()
                        .map(number -> number * number)
                        .collect(Collectors.toList());
        System.out.println(square);
        System.out.println();

        // 3. 문자열리스트 중복 제거 distnt 사용
        List<String> names = Arrays.asList("Alice", "Alice", "Chandler", "David", "Eric", "Daniel");

        names.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println();

        // 4. 스트림 사용 정수 오름차순
        List<Integer> list2 = Arrays.asList(87, 65, 34, 54, 78, 115, 12, 99, 2, 23);

        List<Integer> orderedList =
                list2.stream()
                        .sorted()
                        .collect(Collectors.toList());
        System.out.println(orderedList);

        // 5. 정수리스트에서 모든 짝수의 합
        int evenSum =
                list2.stream()
                        .filter(integer -> integer % 2 == 0)
                        .mapToInt(integer -> integer)
                        .sum();
//                        .reduce(0, Integer::sum);+
        System.out.println(evenSum);

    }
}
