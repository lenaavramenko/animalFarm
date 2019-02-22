package com.accenture.animalfarm;

public class Dog implements Domestic {
    String name;

    public Dog(String name){
    this.name = name;
    }
    @Override
    public void printName() {
        System.out.println("Dogs's name is: " + name);
    }
}
