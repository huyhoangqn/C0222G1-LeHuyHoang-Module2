package _07_abstract_interface.practice.animal_interface_edible.animal;


import _07_abstract_interface.practice.animal_interface_edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: O Ó O";
    }

    @Override
    public String howToEat() {
        return "Chicken: Mổ";
    }
}
