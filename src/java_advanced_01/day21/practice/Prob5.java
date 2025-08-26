package java_advanced_01.day21.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Product implements Serializable {
    private String name;
    private int price;
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Order implements Serializable {
    private int orderId;
    private Product product;
}

public class Prob5 {
    public static void main(String[] args) {
        Product product1 = new Product("iPhone4S",2000);
        Order order = new Order(1, product1);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Temp/order.dat"));) {
            oos.writeObject(order);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Temp/order.dat"))) {
            Object obj = ois.readObject();
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
