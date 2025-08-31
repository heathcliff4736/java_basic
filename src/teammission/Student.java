package teammission;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private List<Integer> record;
    private int total;
    private double average;
    private String grade;


    public Student(String name, List<Integer> scores, int total, double avg, String grade) {
//    public Student(String name, scores[0], int total, double avg, String grade) {
        this.name = name;
        this.record = new ArrayList<>(scores);
        //여기가 배열로 했었는데 규림님꺼 보고 빠르게 고침
        this.total = total;
        this.average = avg;
        this.grade = grade;
    }
}
