package interfacAbstract.thuchanh.Animal.animal;

import interfacAbstract.thuchanh.Animal.edible.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Tiger gừ gừ";
    }

    @Override
    public String howToEat() {
        return "Eat vegetable " ;
    }
}
