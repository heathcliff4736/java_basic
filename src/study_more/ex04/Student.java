package study_more.ex04;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Student implements Comparable<Student> {
    public String id;
    public int score;

    public Student(String id, int score) {
        this.id = id;
        this.score = score;
    }

    //
    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
