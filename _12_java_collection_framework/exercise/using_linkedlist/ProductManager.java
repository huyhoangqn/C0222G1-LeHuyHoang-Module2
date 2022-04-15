package _12_java_collection_framework.exercise.using_linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductManager {
    static LinkedList<Product> productLinkedList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    static {
        productLinkedList.add(new Product("P001", "Clear men", 40000));
        productLinkedList.add(new Product("P002", "Mỳ Gói", 3500));
        productLinkedList.add(new Product("P003", "Chocopices", 20000));
        productLinkedList.add(new Product("P004", "Custas", 35000));
    }

    public void display() {
        for (Product product : productLinkedList) {
            System.out.println(product);
        }
    }

    public void add() {
        System.out.print("Product id: ");
        String productId = scanner.nextLine();

        System.out.print("Product name: ");
        String productName = scanner.nextLine();

        System.out.print("Product price: ");
        double productPrice = Double.parseDouble(scanner.nextLine());

        Product newProduct = new Product(productId, productName, productPrice);
        productLinkedList.add(newProduct);
        System.out.println("Product was added!");
    }

    public void delete(String id) {
        int indexProductDelete = getProductIndexById(id);
        if (indexProductDelete != -1) {
            productLinkedList.remove(indexProductDelete);
            System.out.println("product's deleted");
        } else {
            System.out.println("product id does not exist");
        }
    }

    public void edit(String id) {
        int indexProductEditing = getProductIndexById(id);
        int choose = -1;
        String newProductId;
        String newProductName;
        double newProductPrice;

        if (indexProductEditing != -1) {
            showProductEditing(productLinkedList.get(indexProductEditing));
            while (choose != 0) {
                System.out.print("What do you want to edit: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.print("Enter new id:");
                        newProductId = scanner.nextLine();
                        productLinkedList.get(indexProductEditing).setProductId(newProductId);
                        System.out.println("Product's updated");
                        break;
                    case 2:
                        System.out.print("Enter new name:");
                        newProductName = scanner.nextLine();
                        productLinkedList.get(indexProductEditing).setProductName(newProductName);
                        System.out.println("Product's updated");
                        break;
                    case 3:
                        System.out.print("Enter new price:");
                        newProductPrice = Double.parseDouble(scanner.nextLine());
                        productLinkedList.get(indexProductEditing).setProductPrice(newProductPrice);
                        System.out.println("Product's updated");
                        break;
                    case 4:
                        choose = 0;
                        break;
                    default:
                        System.out.println("No choice selected!");
                }
            }
        } else {
            System.out.println("product id does not exist");
        }
    }

    public boolean getProductByName(String name) {
        boolean result = false;
        for (int i = 0; i < productLinkedList.size(); i++) {
            if (productLinkedList.get(i).getProductId().equals(name)) {
                System.out.println(productLinkedList.get(i));
                result = true;
            }
        }
        return result;
    }

    public int getProductIndexById(String id) {
        for (int i = 0; i < productLinkedList.size(); i++) {
            if (productLinkedList.get(i).getProductId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public void sortProductByPriceAscending() {
        System.out.println("Product list sorted by Price ascending");
        Collections.sort(productLinkedList, new ProductSortByPriceAscending());
    }

    public void sortProductByPriceDescending() {
        System.out.println("Product list sorted by Price descending");
        Collections.sort(productLinkedList, new ProductSortByPriceDescending());
    }

    public void showProductEditing(Product product) {
        System.out.println("Enter your selection:");
        System.out.println("1. Id: " + product.getProductId());
        System.out.println("2. Name: " + product.getProductName());
        System.out.println("3. Price: " + product.getProductPrice());
        System.out.println("4. Exit");
    }
}
