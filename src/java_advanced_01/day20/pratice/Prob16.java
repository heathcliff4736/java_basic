package java_advanced_01.day20.pratice;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//문제 : 3명의 학생 (김철수,21,3.5), (이영희,22,3.9) (박민수, 20,3.2) 학생 정보를
// students.dat파일에 저장하고 다시 읽어 출력 ex) 반 총점 = 10.6  반 평균 = 3.5
// (소수 첫째자리 표현)을 출력하고 학생정보를 나이순으로 콘솔에 출력하세요
public class Prob16 {
    public static void main(String[] args) {
        Student[] students = {
                new Student("김철수", 21, 3.5),
                new Student("이영희", 22, 3.9),
                new Student("박민수", 20, 3.2)
        };
        String filename = "student.dat";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            for (Student student : students) {
                dos.writeUTF(student.getName());
                dos.writeInt(student.getAge());
                dos.writeDouble(student.getScore());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Student[] readStudents = new Student[students.length];
        double totalScore = 0;

        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            for (int i = 0; i < readStudents.length; i++) {
                String name = dis.readUTF();
                int age = dis.readInt();
                double score = dis.readDouble();
                totalScore += score;
                readStudents[i] = new Student(name, age, score);
            }



        } catch (Exception e) {
            e.printStackTrace();
        }
        double averageScore = totalScore / students.length;
        System.out.printf("반 총점 = %.1f  반 평균 = %.1f\n", totalScore, averageScore);

        Arrays.sort(readStudents, Comparator.comparingInt(Student::getAge).reversed());
        for (Student readStudent : readStudents) {
            System.out.println(readStudent);
        }


    }
}
