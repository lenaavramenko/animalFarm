package com.accenture.animalfarm;

public class Fox implements Wild {
    String color;

    public Fox(String color){
        this.color = color;
    }
    @Override
    public void color() {
        System.out.println("The color of Fox is: " + color);
    }
}
