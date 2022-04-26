package Services.impl;

import Services.IPersonServices;
import models.Employee;
import utils.ReadAndWriteEmployee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IPersonServices {
    public static final String EMPLOYEE_PATH = "src\\data\\employee.csv";
    public static List<Employee> employeeList = new ArrayList<>();
    ReadAndWriteEmployee readAndWriteEmployee = new ReadAndWriteEmployee();
    static Scanner scanner = new Scanner(System.in);

    static {
        employeeList.add(new Employee("100", "Huynh Nhan Dai", "15/5/1990", "Nam", "1234567899", "123456789", "email@gmail.com", "Trung cấp", "Nhân Viên", 150.5));
        employeeList.add(new Employee("101", "Nguyen Duy Tai", "15/5/1992", "Nam", "1234567892", "123456782", "email@gmail2.com", "Cao đẳng", "Nhân Viên", 150.2));
        employeeList.add(new Employee("102", "Phan Tấn Trung", "01/1/1975", "Nam", "1234567893", "123456783", "email@gmail.co3", "sau đại học", "Nhân Viên", 250.0));
    }

    @Override
    public void displayList() {
        employeeList = readAndWriteEmployee.readFromFile(EMPLOYEE_PATH, employeeList);
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }


    @Override
    public void add() throws IOException {
        employeeList = readAndWriteEmployee.readFromFile(EMPLOYEE_PATH, employeeList);
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
        System.out.println("Enter Academic Level: ");
        String level = scanner.nextLine();
        System.out.println("Enter position");
        String position = scanner.nextLine();
        System.out.println("Enter salary: ");
        double salary = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(id, name, birthday, gender, idCard, phoneNumer, email, level, position, salary);
        employeeList.add(employee);
        readAndWriteEmployee.writeToFile(EMPLOYEE_PATH, employeeList);
        System.out.println("Add employee complete");
    }


    public int getID(String id) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeCode().toLowerCase().equals(id.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }


    public void edit() throws IOException {
        employeeList = readAndWriteEmployee.readFromFile(EMPLOYEE_PATH, employeeList);
        displayList();
        System.out.println("Enter employee id you want to edit: ");
        String editByID = scanner.nextLine();
        int getID = getID(editByID);
        if (getID == -1) {
            System.out.println("Not found employee, Enter again, please!");
        } else {
            System.out.println(employeeList.get(getID));
            int exit = 0;
            while (exit == 0) {
                System.out.println(
                        "1. ID: " + employeeList.get(getID).getEmployeeCode() + "\n" +
                                "2. Name: " + employeeList.get(getID).getName() + "\n" +
                                "3. Birthday:  " + employeeList.get(getID).getBirthDay() + "\n" +
                                "4. Gender:  " + employeeList.get(getID).getGender() + "\n" +
                                "5. Id Card:  " + employeeList.get(getID).getCmnd() + "\n" +
                                "6. Phone Number:  " + employeeList.get(getID).getPhone() + "\n" +
                                "7. Email:  " + employeeList.get(getID).getEmail() + "\n" +
                                "8. Academic Level:  " + employeeList.get(getID).getLevel() + "\n" +
                                "9. Position:  " + employeeList.get(getID).getPosition() + "\n" +
                                "10. Salary:  " + employeeList.get(getID).getSalary() + "\n" +
                                "11. Exit" + "\n" +
                                "Enter your choice"
                );
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Enter employee id you want to replace");
                        String replaceId = scanner.nextLine();
                        employeeList.get(getID).setEmployeeCode(replaceId);
                        break;
                    case 2:
                        System.out.println("Enter employee name you want to replace");
                        String replaceName = scanner.nextLine();
                        employeeList.get(getID).setName(replaceName);
                        break;
                    case 3:
                        System.out.println("Enter birthday you want to replace");
                        String replaceBirthday = scanner.nextLine();
                        employeeList.get(getID).setBirthDay(replaceBirthday);
                        break;
                    case 4:
                        System.out.println("Enter gender you want to replace");
                        String replaceGender = scanner.nextLine();
                        employeeList.get(getID).setGender(replaceGender);
                        break;
                    case 5:
                        System.out.println("Enter Id card you want to replace");
                        String replaceIdCard = scanner.nextLine();
                        employeeList.get(getID).setCmnd(replaceIdCard);
                        break;
                    case 6:
                        System.out.println("Enter phone number you want to replace");
                        String replacePhoneNumber = scanner.nextLine();
                        employeeList.get(getID).setPhone(replacePhoneNumber);
                        break;
                    case 7:
                        System.out.println("Enter email card you want to replace");
                        String replaceEmail = scanner.nextLine();
                        employeeList.get(getID).setEmail(replaceEmail);
                        break;
                    case 8:
                        System.out.println("Enter Academic level you want to replace");
                        String replaceAcademicLevel = scanner.nextLine();
                        employeeList.get(getID).setLevel(replaceAcademicLevel);
                        break;
                    case 9:
                        System.out.println("Enter position you want to replace");
                        String replacePosition = scanner.nextLine();
                        employeeList.get(getID).setPosition(replacePosition);
                        break;
                    case 10:
                        System.out.println("Enter birthday you want to replace");
                        double replaceSalary = Double.parseDouble(scanner.nextLine());
                        employeeList.get(getID).setSalary(replaceSalary);
                        break;
                    case 11:
                        exit = -1;
                        break;
                }
            }
            readAndWriteEmployee.writeToFile(EMPLOYEE_PATH, employeeList);
        }
    }

}
