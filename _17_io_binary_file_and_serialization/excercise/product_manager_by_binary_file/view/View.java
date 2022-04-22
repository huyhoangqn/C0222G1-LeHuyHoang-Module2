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
                        "2. Delete product\n" +
                        "3. Display product list\n" +
                        "4. Searching product\n" +
                        "5. Save to file\n" +
                        "6. Exit");
                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        productController.addNewProduct();
                        break;
                    case 2:
                        System.out.print("Comming soon: ");
                        break;
                    case 3:
                        productController.displayProductList();
                        break;
                    case 4:
                        System.out.print("Enter product name: ");
                        productName = scanner.nextLine();
                        productController.searchProduct(productName);
                        break;
                    case 5:
                        productController.saveToBianryFile();
                        break;
                    case 6:
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
