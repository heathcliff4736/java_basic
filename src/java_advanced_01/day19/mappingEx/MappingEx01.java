package java_advanced_01.day19.mappingEx;

import java_advanced_01.day18.streamhomework.ex06.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Getter
@AllArgsConstructor
class Student {
    private String name;
    private int score;
}

public class MappingEx01 {
    public static void main(String[] args) {

        // 학생 3명을 리스트컬렉션을 생성하여 순서대로 저장하세요
        List<Student> students = Arrays.asList(
                new Student("엄현석", 90),
                new Student("김현석", 100),
                new Student("김석현", 60)
        );

        // 학생 점수 stream 방법으로 출력
        students.stream()
                .map(Student::getScore)
                .forEach(sc -> System.out.println(sc));
//                .forEach(System.out::println);

        System.out.println();

        // 학생의 총점 출력
        int sum = students.stream()
                .mapToInt(Student::getScore)
                .sum();
        System.out.println("총점: "+sum);
        System.out.println();

        // 평균 출력 (소숫점1)
        double avg = students.stream()
                .mapToInt(Student::getScore)
                .average()
                .getAsDouble();

        System.out.printf("평균: %.1f", avg);


    }

}
