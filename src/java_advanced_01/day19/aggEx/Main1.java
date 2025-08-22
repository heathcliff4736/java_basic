package java_advanced_01.day19.aggEx;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
class Student {
    private String name;
    private int score;
}

public class Main1 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 92),
                new Student("David", 95),
                new Student("Bob", 88)
        );

        List<Student> students2 = new ArrayList<>();
        // 합계

        int sum1 = students.stream().mapToInt(Student::getScore).sum();
        System.out.println(sum1);

        int sum2 = students.stream().mapToInt(Student::getScore).reduce(0, (a, b) -> a + b);
        // reduce() 스트림에 요소가 없을 경우 예외가 발생하지만, identity매개값이 주어지면 디폴트값으로 리턴한다.
        System.out.println(sum2);

        int sum3 = students2.stream().mapToInt(Student::getScore).reduce(0, (a, b) -> a + b);
        System.out.println(sum3);


    }
}
