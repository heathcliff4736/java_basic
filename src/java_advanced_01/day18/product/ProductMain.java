package java_advanced_01.day18.product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ProductMain {
    public static void main(String[] args) {

        // List<Product> ArrayList products 생성
        List<Product> products = new ArrayList<>();

        //5개의 제품 생성
        products.add(new Product(001, "다이슨 에어랩", "Dyson", 879000));
        products.add(new Product(002, "LG 휘센 에어컨", "LG", 2590000));
        products.add(new Product(003, "LG 로봇청소기", "LG", 1290000));
        products.add(new Product(004, "비스포크 냉장고", "삼성", 3289000));
        products.add(new Product(005, "드럼 세탁기", "삼성", 1990000));

        //스트림 얻고 출력
        Stream<Product> productStream = products.stream();
        productStream.forEach(System.out::println);
//        productStream.forEach(name -> System.out.println(name));

    }
}
