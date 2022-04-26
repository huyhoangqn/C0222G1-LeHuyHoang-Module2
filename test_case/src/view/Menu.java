package view;


import controller.FuramaController;
import controller.IController;

public class Menu {
    public static void main(String[] args) {
        IController mainMenu = new FuramaController();
        mainMenu.displayMenu();
    }
}
