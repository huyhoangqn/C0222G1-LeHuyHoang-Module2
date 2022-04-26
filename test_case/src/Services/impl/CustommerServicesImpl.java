package Services.impl;

import Services.IPersonServices;
import models.Customer;
import utils.ReadAndWriteCustomer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustommerServicesImpl implements IPersonServices {
    public static final String CUSTOMER_PATH = "src\\data\\customer.csv";
    public static List<Customer> customerList = new ArrayList<Customer>();
    static ReadAndWriteCustomer readAndWriteCustomer = new ReadAndWriteCustomer();
    static Scanner scanner = new Scanner(System.in);

    static {
        customerList.add(new Customer("001", "Huynh Thien Quang", "28/1/1995", "male", "21236982", "036922569", "thienquang@gmail.com", "adress1", "Diamond"));
        customerList.add(new Customer("002", "Nguyen Quoc Tuan", "24/10/1990", "male", "36251289", "792136359", "quoctuan@gmail.com", "adress2", "Member"));

    }

    @Override
    public void displayList() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }


    public void add() throws IOException {
        System.out.println("Enter id: ");
        String id = scanner.nextLine();
        System.out.println("Enter full name: ");
        String name = scanner.nextLine();
        System.out.println("Enter birthday");
        String birthday = scanner.nextLine();
        System.out.println("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.println("Enter ID Card: ");
        String idCard = scanner.nextLine();
        System.out.println("Enter phone number");
        String phoneNumer = scanner.nextLine();
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        System.out.println("Enter Address: ");
        String address = scanner.nextLine();
        System.out.println("Enter type");
        String type = scanner.nextLine();
        Customer customer = new Customer(id, name, birthday, gender, idCard, phoneNumer, email, address, type);
        customerList.add(customer);
        readAndWriteCustomer.writeToFile(CUSTOMER_PATH, customerList);
        System.out.println("Add employee complete");
    }


    public int getID(String id) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().toLowerCase().equals(id.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }


    public void edit() throws IOException {
        customerList = readAndWriteCustomer.readFromFile(CUSTOMER_PATH, customerList);
        displayList();
        System.out.println("Enter employee id you want to edit: ");
        String editByID = scanner.nextLine();
        int getID = getID(editByID);
        if (getID == -1) {
            System.out.println("Not found employee, Enter again, please!");
        } else {
            System.out.println(customerList.get(getID));
            int exit = 0;
            while (exit == 0) {
                System.out.println(
                        "1. ID: " + customerList.get(getID).getId() + "\n" +
                                "2. Name: " + customerList.get(getID).getName() + "\n" +
                                "3. Birthday:  " + customerList.get(getID).getBirthDay() + "\n" +
                                "4. Gender:  " + customerList.get(getID).getGender() + "\n" +
                                "5. Id Card:  " + customerList.get(getID).getCmnd() + "\n" +
                                "6. Phone Number:  " + customerList.get(getID).getPhone() + "\n" +
                                "7. Email:  " + customerList.get(getID).getEmail() + "\n" +
                                "8. Address:  " + customerList.get(getID).getAdress() + "\n" +
                                "9. Type:  " + customerList.get(getID).getCustommerType() + "\n" +
                                "10. Exit" + "\n" +
                                "Enter your choice"
                );
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Enter employee id you want to replace");
                        String replaceId = scanner.nextLine();
                        customerList.get(getID).setId(replaceId);
                        break;
                    case 2:
                        System.out.println("Enter employee name you want to replace");
                        String replaceName = scanner.nextLine();
                        customerList.get(getID).setName(replaceName);
                        break;
                    case 3:
                        System.out.println("Enter birthday you want to replace");
                        String replaceBirthday = scanner.nextLine();
                        customerList.get(getID).setBirthDay(replaceBirthday);
                        break;
                    case 4:
                        System.out.println("Enter gender you want to replace");
                        String replaceGender = scanner.nextLine();
                        customerList.get(getID).setGender(replaceGender);
                        break;
                    case 5:
                        System.out.println("Enter Id card you want to replace");
                        String replaceIdCard = scanner.nextLine();
                        customerList.get(getID).setCmnd(replaceIdCard);
                        break;
                    case 6:
                        System.out.println("Enter phone number you want to replace");
                        String replacePhoneNumber = scanner.nextLine();
                        customerList.get(getID).setPhone(replacePhoneNumber);
                        break;
                    case 7:
                        System.out.println("Enter email card you want to replace");
                        String replaceEmail = scanner.nextLine();
                        customerList.get(getID).setEmail(replaceEmail);
                        break;
                    case 8:
                        System.out.println("Enter address you want to replace");
                        String replaceAddress = scanner.nextLine();
                        customerList.get(getID).setAdress(replaceAddress);
                        break;
                    case 9:
                        System.out.println("Enter type you want to replace");
                        String replaceType = scanner.nextLine();
                        customerList.get(getID).setCustommerType(replaceType);
                        break;
                    case 10:
                        exit = -1;
                        break;
                }
            }
            readAndWriteCustomer.writeToFile(CUSTOMER_PATH, customerList);
        }
    }
}
