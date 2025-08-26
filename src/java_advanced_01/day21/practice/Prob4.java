package java_advanced_01.day21.practice;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.*;

@AllArgsConstructor
@Data
class Account implements Serializable {
    private String owner;
    private transient int balance;  // 직렬화 제외
    private static final long serialVersionUID = 1L;

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        oos.writeInt(balance);
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        this.balance = ois.readInt(); // 직접복원
    }
}



public class Prob4 {
    public static void main(String[] args) {

        Account account = new Account("철수", 10000);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Temp/student.dat"))) {
            oos.writeObject(account);
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Temp/student.dat"))) {
            Object obj = ois.readObject();
            System.out.println(obj);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
