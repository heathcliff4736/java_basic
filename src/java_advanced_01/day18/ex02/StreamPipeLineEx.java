package java_advanced_01.day18.ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineEx {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("김진우", 90));
        students.add(new Student("박종우", 80));
        students.add(new Student("이상혁", 60));

        List<Student> studentsList = Arrays.asList(
                new Student("박지원", 90),
                new Student("정약용", 100),
                new Student("심진우", 50)
        );

        // 방법 1. 스트림 => 중간처리 => 최종처리 => 학생들의 평균점수
        // 스트림 얻기
        Stream<Student> studentStream1 = students.stream();
        // 중간처리 (학생 객체를 점수(정수타입)로 매핑)
        IntStream scoreStream = studentStream1.mapToInt(
                student -> student.getScore()
        );
        // 최종처리 (평균구하기)
        double averageScore1 = scoreStream.average().getAsDouble();
        System.out.println(averageScore1);


        // 방법 2. 람다식을 주입해서 파이프라인 처리 방식
        double averageScore2 = studentsList.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();

    }
}
