package com.accenture.animalfarm;

public class Cat implements Domestic {
    String name;


    public Cat(String name){
        this.name = name;
    }

    @Override
    public void printName() {

        System.out.println("Cat' s name is: " + name);
    }
}
