package java_advanced_01.day18;

import java.util.stream.IntStream;

public class RangeStreamEx {
    public static void main(String[] args) {

        IntStream.rangeClosed(1, 10).forEach(i -> System.out.println(i + " "));
    }
}
