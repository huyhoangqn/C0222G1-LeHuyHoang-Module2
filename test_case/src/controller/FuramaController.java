package controller;

import Services.IFacilityServices;
import Services.IPersonServices;
import Services.impl.CustommerServicesImpl;
import Services.impl.EmployeeServiceImpl;
import Services.impl.FacilityServiceImpl;

import java.io.IOException;
import java.util.Scanner;

public class FuramaController implements IController {
    static Scanner scanner = new Scanner(System.in);
    static IPersonServices employee = new EmployeeServiceImpl();
    static IPersonServices customer = new CustommerServicesImpl();
    static IFacilityServices facility = new FacilityServiceImpl();


    public FuramaController() {

    }

    @Override
    public void displayMenu() {
        System.out.println("\nMAIN MENU");
        System.out.println("1.\tEmployee Management\n" +
                "2.\tCustomer Management\n" +
                "3.\tFacility Management \n" +
                "4.\tBooking Management\n" +
                "5.\tPromotion Management\n" +
                "6.\tExit\n" +
                "Enter your selection");

        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("\nEMPLOYEE MANAGER\n" +
                                "1.\tDisplay list employees\n" +
                                "2.\tAdd new employee\n" +
                                "3.\tEdit employee\n" +
                                "4.\tReturn main menu\n" +
                                "Enter your selection");
                        int choice1;
                        while (true) {
                            choice1 = Integer.parseInt(scanner.nextLine());
                            try {
                                switch (choice1) {
                                    case 1:
                                        employee.displayList();
                                        displayMenu();
                                        break;
                                    case 2:
                                        employee.add();
                                        displayMenu();
                                        break;
                                    case 3:
                                        employee.edit();
                                        displayMenu();
                                        break;
                                    case 4:
                                        System.out.println("Return to main menu");
                                        displayMenu();
                                        break;
                                    default:
                                        System.err.println("Please enter the correct number");
                                        displayMenu();
                                        break;
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.err.println("Exception: The entered character is not a number");
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        break;
                    case 2:
                        System.out.println("\nCUSTOMER MANAGER\n" +
                                "1. \tDisplay list customers\n" +
                                "2.\tAdd new customer\n" +
                                "3.\tEdit customer\n" +
                                "4.\tReturn main menu\n+" +
                                "Enter your selection");

                        int choice2;
                        while (true) {
                            try {
                                choice2 = Integer.parseInt(scanner.nextLine());
                                switch (choice2) {
                                    case 1:
                                        customer.displayList();
                                        displayMenu();
                                        break;
                                    case 2:
                                        customer.add();
                                        displayMenu();
                                        break;
                                    case 3:
                                        customer.edit();
                                        displayMenu();
                                        break;
                                    case 4:
                                        System.out.println("Return to main menu");
                                        displayMenu();
                                        break;
                                    default:
                                        System.err.println("Please enter the correct number");
                                        displayMenu();
                                        break;
                                }
                                break;

                            } catch (NumberFormatException e) {
                                System.err.println("Exception: The entered character is not a number");
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        break;
                    case 3:
                        System.out.println("\nFACILITY MANAGER\n" +
                                "1.\tDisplay list facility\n" +
                                "2.\tAdd new facility\n" +
                                "3.\tDisplay list facility maintenance\n" +
                                "4.\tReturn main menu\n" +
                                "Enter your selection");

                        int choice3;
                        while (true) {
                            try {
                                choice3 = Integer.parseInt(scanner.nextLine());
                                switch (choice3) {
                                    case 1:
                                        facility.displayFacility();
                                        displayMenu();
                                        break;
                                    case 2:
                                        addNewFacility();
                                        displayMenu();
                                        break;
                                    case 3:
                                        facility.displayMaintain();
                                        displayMenu();
                                        break;
                                    case 4:
                                        System.out.println("Return to main menu");
                                        displayMenu();
                                        break;
                                    default:
                                        System.err.println("Please enter the correct number");
                                        displayMenu();
                                        break;
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.err.println("Exception: The entered character is not a number");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("\nBOOKING MANAGER\n" +
                                "1.\tDisplay list booking\n " +
                                "2.\tAdd new booking\n" +
                                "3.\tDisplay list contracts\n" +
                                "4.\tCreate new constracts\n " +
                                "5.\tEdit contracts\n" +
                                "6.\tReturn main menu\n" +
                                "Enter your selection");

                        int choice4;
                        while (true) {
                            try {
                                choice4 = Integer.parseInt(scanner.nextLine());
                                switch (choice4) {
                                    case 1:

                                        break;
                                    case 2:

                                        break;
                                    case 3:

                                        break;
                                    case 4:

                                        break;
                                    case 5:
                                        displayMenu();
                                        break;
                                    case 6:
                                        System.out.println("Return to main menu");
                                        displayMenu();
                                        break;
                                    default:
                                        System.err.println("Please enter the correct number");
                                        displayMenu();
                                        break;
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.err.println("Exception: The entered character is not a number");
                            }
                        }

                        break;
                    case 5:
                        System.out.println("\nPROMOTION MANAGER\n" +
                                "1.\tDisplay list customers use service\n" +
                                "2.\tDisplay list customers get voucher\n" +
                                "3.\tAdd new voucher\n" +
                                "4.\tReturn main menu\n" +
                                "Enter your selection");

                        int choice6;
                        while (true) {
                            try {
                                choice6 = Integer.parseInt(scanner.nextLine());
                                switch (choice6) {
                                    case 1:

                                        break;
                                    case 2:

                                        break;
                                    case 3:

                                        break;
                                    case 4:
                                        System.out.println("Return to main menu");
                                        displayMenu();
                                        break;
                                    default:
                                        System.err.println("Please enter the correct number");
                                        displayMenu();
                                        break;
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.err.println("Exception: The entered character is not a number");
                            }
                        }
                        break;
                    case 6:
                        break;
                    default:
                        System.err.println("Please enter the correct number");
                        displayMenu();
                        break;
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Exception: The entered character is not a number");
                displayMenu();
            }
        }

    }

    private static void addNewFacility() {
        System.out.println("\nUPDATE FACILITY\n" +
                "1 .\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu" +
                "Enter your selection"
        );
        int choiceToAdd = Integer.parseInt(scanner.nextLine());
        while (true) {
            try {
                switch (choiceToAdd) {
                    case 1:
                        facility.addVilla();
                        facility.displayFacility();
                        addNewFacility();
                        break;
                    case 2:
                        facility.addHouse();
                        facility.displayFacility();
                        addNewFacility();
                        break;
                    case 3:
                        facility.addRoom();
                        facility.displayFacility();
                        addNewFacility();
                        break;
                    case 4:
                        System.out.println("Return facility manager");
                        break;
                    default:
                        System.err.println("Please enter the correct number");
                        IController menu = new FuramaController();
                        menu.displayMenu();
                        break;
                }
                break;
            } catch (NumberFormatException | IOException e) {
                System.err.println("Exception: The entered character is not a number");
            }

        }
    }
}