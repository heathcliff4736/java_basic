package java_advanced_01.day18.product;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Product {

    // 제품은 제품번호(pNo), 제품이름(pName), 제조사(pCompany), 가격(price)이란 속성을 가지고있다.
    // Setter, Getter, toString 오버라이딩
    // 제품생성시 모든 속성의 값을 할당하여 제품을 생산합니다.
    private int pNo;
    private String pName;
    private String pCompany;
    private int price;

}
