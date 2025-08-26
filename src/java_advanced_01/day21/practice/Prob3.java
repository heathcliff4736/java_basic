package java_advanced_01.day21.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Student implements Serializable {
    private String name;
    private int grade;
}

public class Prob3 {
    public static void main(String[] args) {
        Student student1 = new Student("이순신", 30);
        Student student2 = new Student("김순신", 40);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Temp/student.dat"))) {
            oos.writeObject(student1);
            oos.writeObject(student2);
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Temp/student.dat"))) {
            while (true) {
                Object obj = ois.readObject();
                System.out.println(obj);
            }
        } catch (EOFException e) {
            System.out.println("파일 끝.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
