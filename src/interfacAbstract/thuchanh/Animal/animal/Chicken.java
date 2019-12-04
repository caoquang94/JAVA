package interfacAbstract.thuchanh.Animal.animal;

import interfacAbstract.thuchanh.Animal.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken Chích chích";
    }

    @Override
    public String howToEat() {
        return "could be fired";
    }
}