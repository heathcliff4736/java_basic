package java_advanced_01.day18.streamhomework.ex05;

import java_advanced_01.day18.ex02.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lamda Expressions",
                "Java8 supports lamda expressions"
        );
        list.stream()
                .filter(listItem -> listItem.toLowerCase().contains("java"))
                .forEach(System.out::println);

    }
}
