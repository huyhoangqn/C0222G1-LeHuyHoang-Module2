package _17_io_binary_file_and_serialization.excercise.product_manager_by_binary_file.controller;

import _17_io_binary_file_and_serialization.excercise.product_manager_by_binary_file.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController {
    static Scanner scanner = new Scanner(System.in);
    static List<Product> productList = new ArrayList<>();
    final static String PRODUCT_SOURCE_FILE = "src\\_17_io_binary_file_and_serialization\\excercise\\product_manager_by_binary_file\\data\\Product.txt";

    public void addNewProduct() {
        System.out.print("Product id: ");
        String productId = scanner.nextLine();

        System.out.print("Product name: ");
        String productName = scanner.nextLine();

        System.out.print("Product manufactor: ");
        String productManufactor = scanner.nextLine();

        System.out.print("Product price: ");
        double productPrice = Double.parseDouble(scanner.nextLine());

        Product newProduct = new Product(productId, productName, productManufactor, productPrice);
        productList.add(newProduct);
        System.out.println("Product was added!");
        writeProductToBinaryFile(PRODUCT_SOURCE_FILE, productList);
    }

    public void displayProductList() {
        System.out.println("Product's list: ");
        productList = readProductFromBinaryFile(PRODUCT_SOURCE_FILE);
        System.out.println(productList);
    }

    public void searchProduct() {
        System.out.println("Enter name you want to find!");
        String name = scanner.nextLine();
        productList = readProductFromBinaryFile(PRODUCT_SOURCE_FILE);
        for (Product product : productList) {
            if (product.getProductName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(product);
            } else {
                System.out.println("Not found product");
            }
        }
    }


    public static List<Product> readProductFromBinaryFile(String path) {
        List<Product> products = new ArrayList<>();
        try {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            if (file.length() > 0) {
                FileInputStream fileInput = new FileInputStream(file);
                ObjectInputStream ObjectInput = new ObjectInputStream(fileInput);
                products = (List<Product>) ObjectInput.readObject();
                fileInput.close();
                ObjectInput.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products;
    }

    public static void writeProductToBinaryFile(String path, List<Product> products) {
        try {
            File file = new File(path);
            FileOutputStream fileOutput = new FileOutputStream(file);
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
            objectOutput.writeObject(products);
            objectOutput.close();
            fileOutput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
