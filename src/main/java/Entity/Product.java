package Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String name;    // 상품명
    private int price;      // 가격
    private String madeBy;  // 제조사
    private String store;   // 파는 곳
}


