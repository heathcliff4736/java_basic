package java_advanced_01.day19.filtersEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilteringEx01 {
    public static void main(String[] args) {
        // List 컬렉션 ArrayList 생성
        // list에 5명의 이름을 저장하세요 (5명의 이름중 같은 이름 두번)

        List<String> list1 = new ArrayList<>();
        list1.add("엄현석1");
        list1.add("엄현석1");
        list1.add("엄현석2");
        list1.add("엄현석3");
        list1.add("엄현석4");


        List<String> list2 = Arrays.asList(
                "엄현석", "엄현석", "현현석", "석현석", "김현석"
        );

        List<String> list = Arrays.asList(
                new String("엄현석1"),
                new String("엄현석1"),
                new String("엄현석2"),
                new String("엄현석3"),
                new String("엄현석4")
        );

        list.stream().forEach(System.out::println);
        System.out.println();

        list.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println();

//        list2.stream().forEach(System.out::println);
//        System.out.println();
//
//        list2.stream()
//                .distinct()
//                .forEach(System.out::println);

        // list2에서 중복을 제거하고 이름에 "엄" 들어간 사람의 이름을 출력하세요
        list2.stream()
                .distinct().
                filter(listItem -> listItem.toLowerCase().contains("엄"))
                .forEach(System.out::println);



    }
}
