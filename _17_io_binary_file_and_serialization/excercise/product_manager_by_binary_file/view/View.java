package _17_io_binary_file_and_serialization.excercise.product_manager_by_binary_file.view;

import _17_io_binary_file_and_serialization.excercise.product_manager_by_binary_file.controller.ProductController;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        try {
            ProductController productController = new ProductController();
            Scanner scanner = new Scanner(System.in);
            String productName;
            int choice = -1;
            while (choice != 0) {
                System.out.println("-----------------------------------------\n" +
                        "Main menu:\n" +
                        "1. Add new product\n" +
                        "2. Display product list\n" +
                        "3. Searching product\n" +
                        "4. Exit");
                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        productController.addNewProduct();
                        break;
                    case 2:
                        productController.displayProductList();
                        break;
                    case 3:
                        productController.searchProduct();
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("No choice selected");
                }
            }
        } catch (Exception e) {
        }
    }
}
