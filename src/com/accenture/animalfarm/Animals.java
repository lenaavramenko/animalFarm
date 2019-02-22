package com.accenture.animalfarm;
// Task AnimalFarm
// Create interface Animal
//
// add to it void method sound()
// then create classes Cat, Dog, Fox
// every of these classes should implement Animal interface
// Fox should print out in console "wa-pow"
// Cat should print out in console "Meow"
// Dog should print out in console "Bark"
// Create class named Animals with method main
// create objects of class, that is implementing Animal, for each of them call method sound

public class Animals {

    public static void main(String[] args) {
        Fox fox = new Fox("White");
        fox.color();

        Dog dog = new Dog("Wolf");
        dog.printName();

        Cat cat = new Cat("Tommy");
        cat.printName();


    }
}
