package interfacAbstract.thuchanh.Animal;

import interfacAbstract.thuchanh.Animal.animal.Animal;
import interfacAbstract.thuchanh.Animal.animal.Chicken;
import interfacAbstract.thuchanh.Animal.animal.Tiger;
import interfacAbstract.thuchanh.Animal.edible.Edible;
import interfacAbstract.thuchanh.Animal.fruit.Apple;
import interfacAbstract.thuchanh.Animal.fruit.Fruit;
import interfacAbstract.thuchanh.Animal.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }

        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}