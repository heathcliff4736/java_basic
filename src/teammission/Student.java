package teammission;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private List<Integer> record;
    private int total;
    private double average;
    private String grade;


    public Student(String name, int score, int score1, int score2, int score3, int total, double avg, String grade) {
        this.name = name;
        this.record = List.of(score,score1,score2,score3);
        this.total = total;
        this.average = avg;
        this.grade = grade;
    }
}
