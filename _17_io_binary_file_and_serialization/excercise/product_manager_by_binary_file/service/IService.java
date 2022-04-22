package _17_io_binary_file_and_serialization.excercise.product_manager_by_binary_file.service;

import _17_io_binary_file_and_serialization.excercise.product_manager_by_binary_file.model.Product;

import java.util.List;

public interface IService {
    void display();

    void add(Product product);

    List<Product> search(String name);

    List<Product> getProductArrayList();

    void setProductArrayList(List<Product> productArrayList);
}
