package java_advanced_01.day18;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStreamEx {
    public static void main(String[] args) {
        String[] strings = new String[]{"1","2","3","4","5"};
        
        // 배열로부터 Stream 얻기 Arrays.stream
        Stream<String> stream = Arrays.stream(strings);
//        stream.forEach(System.out::println);
        stream.forEach(item -> System.out.print (item+" "));
        System.out.println();

        Integer[] integers = new Integer[]{1,2,3,4,5};
        Stream<Integer> streamInt = Arrays.stream(integers);
        streamInt.forEach(item -> System.out.print (item+" "));

    }
}
