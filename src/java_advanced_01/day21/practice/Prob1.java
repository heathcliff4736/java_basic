package java_advanced_01.day21.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@AllArgsConstructor
@NoArgsConstructor
@Data
class Person implements Serializable {
    @Serial
    private static final long serialVerionUID = 1L;
    private String name;
    private transient int age;
}

public class Prob1 {
    public static void main(String[] args) {
        Path path = Paths.get("C:/Temp/order.dat");
        Person p = new Person("홍길동", 30);
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Temp/person.dat"));){
            while (true) {
                Person p1 = (Person) ois.readObject();
                System.out.println(p1.toString());
            }
        } catch (EOFException e) {
            System.out.println("파일 끝. ");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
