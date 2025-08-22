package java_advanced_01.day19.optionalEx;

import java.util.*;

public class OptionalEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println(avg);
        System.out.println();

        // 방법1
        OptionalDouble optionalDouble =
                list.stream()
                        .mapToInt(Integer::intValue)
                        .average();

        if (optionalDouble.isPresent()) {
            System.out.println(optionalDouble.getAsDouble());
        } else {
            System.out.println("0.0");
        }
        System.out.println();

        // 방법2
        double avg2 = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
        System.out.println(avg2);
        System.out.println();

        // 방법3
        list.stream().mapToInt(Integer::intValue).average().ifPresent(System.out::println);
        System.out.println();
    }
}
