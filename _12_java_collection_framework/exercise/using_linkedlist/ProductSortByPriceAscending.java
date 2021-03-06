package _12_java_collection_framework.exercise.using_linkedlist;

import java.util.Comparator;

public class ProductSortByPriceAscending implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        if (product1.getProductPrice() == product2.getProductPrice()) {
            return 0;
        } else if (product1.getProductPrice() > product2.getProductPrice()) {
            return 1;
        } else {
            return -1;
        }
    }
}
