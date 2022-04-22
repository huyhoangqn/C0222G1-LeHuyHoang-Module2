package _17_io_binary_file_and_serialization.excercise.product_manager_by_binary_file.service;

import _17_io_binary_file_and_serialization.excercise.product_manager_by_binary_file.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements IService {
    private List<Product> productArrayList = new ArrayList<>();

    public List<Product> getProductArrayList() {
        return productArrayList;
    }

    public void setProductArrayList(List<Product> productArrayList) {
        this.productArrayList = productArrayList;
    }

    public void display() {
        for (Product product : productArrayList) {
            System.out.println(product);
        }
    }

    public void add(Product product) {
        this.productArrayList.add(product);
    }

    public List<Product> search(String name) {
        List<Product> result = new ArrayList<>();
        for (Product product : productArrayList) {
            if (product.getProductName().toLowerCase().contains(name.toLowerCase())) {
                result.add(product);
            }
        }
        return result;
    }
}
