package java_advanced_01.day21.practice;

import lombok.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

@AllArgsConstructor
@NoArgsConstructor
@Data
class Book implements Serializable {
    private String title;
    private int price;
    private static final long serialVersionUID = 1L;
}

public class Prob2 {
    public static void main(String[] args) {
        ArrayList<Book> books =  new ArrayList<>(Arrays.asList(
                new Book("수학의정석", 25000),
                new Book("과학의정석", 30000),
                new Book("문학의정석", 19000)
        ));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Temp/book.dat"))) {
            oos.writeObject(books);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Temp/book.dat"));){
            Object obj = ois.readObject();
            ArrayList<Book> list = (ArrayList<Book>) obj;
            list.forEach(System.out::println);
//        } catch (EOFException e) {
//            System.out.println("파일 끝. ");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
