package javabasic_02.day09.oop;

import javax.naming.StringRefAddr;

public class Student {
    // Student 멤버(필드)
    private String stu_name;
    private Integer stu_age;
    private String address;
    private String stu_ssn;
    private int korScores;
    private int engScores;
    private int mathScores;
    String gender;

    
    // 생성자 메소드를 통하여 학생의 객체의 필드를 초기화
    Student() {  }      // 기본 생성자

    Student(String stu_name, Integer stu_age, String address, String stu_ssn, int korScores, int engScores, int mathScores){
        this.korScores = korScores;
        this.engScores = engScores;
        this.mathScores = mathScores;
        this.stu_name = stu_name;
        this.stu_ssn = stu_ssn;
        this.stu_age = stu_age;
        this.address = address;
    }

    Student(String stu_name, String stu_ssn){
        this.stu_name = stu_name;
        this.stu_ssn = stu_ssn;
    }
    Student(String stu_name, Integer stu_age, String address, String stu_ssn){
        this.stu_name = stu_name;
        this.stu_ssn = stu_ssn;
        this.stu_age = stu_age;
        this.address = address;
    }

    public String getStu_name() {
        // return this.stu_name;       동일
        return stu_name;
    }

    public Integer getStu_age() {
        return stu_age;
    }

    public String getAddress() {
        return address;
    }

    public String getStu_ssn() {
        return stu_ssn;
    }

    public int getKorScores() {
        return korScores;
    }

    public int getEngScores() {
        return engScores;
    }

    public int getMathScores() {
        return mathScores;
    }

    // Object 클래스의 toString() 오버로딩
    @Override
    public String toString() {
        return "Student{" +
                "stu_name='" + stu_name + '\'' +
                ", stu_age=" + stu_age +
                ", address='" + address + '\'' +
                ", stu_ssn='" + stu_ssn + '\'' +
                ", korScore=" +  korScores+
                ", engScore=" + engScores +
                ", mathScore=" + mathScores +
                '}';
    }
}
