package study_more.ex02;

import java.util.Objects;

public class Student {
    public int studentNum;
    public String name;
    
    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }
    
    // 여기에 코드 작성
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            return this.studentNum == s.studentNum;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.studentNum, studentNum);
    }
}
