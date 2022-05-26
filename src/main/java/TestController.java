import Entity.Product;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestController {
    public static void main(String[] args) {
        ArrayList products = new ArrayList<>();

        products.add(new Product("미피", 10000, "Nederland", "문구점"));
        products.add(new Product("라이언", 100, "Korea", "KakaoFriends"));
        products.add(new Product("춘식이", 500, "Korea", "KakaoFriends"));
        products.add(new Product("키티", 100, "Japan", "일본의 한 가게"));

        Predicate<Product> predicate =
                (Product product) -> product.getName().equals("미피")
                        && product.getStore().equals("문구점");
        
        ArrayList<Product> filteredByPrice = filterPredicate(products, predicate);

        System.out.println("filteredByPrice = " + filteredByPrice);
    }
    public static ArrayList<Product> filterPredicate(ArrayList<Product> products, Predicate<Product> filter) {
        ArrayList<Product> filteredProducts = new ArrayList<>();

        for (Product product : products) {
            if (filter.test(product)) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
}
