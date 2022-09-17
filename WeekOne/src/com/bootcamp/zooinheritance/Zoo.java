package com.bootcamp.zooinheritance;

public class Zoo {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.name = "Phily";
        c1.age = 2;
        c1.sound = "Meow Meow";
        c1.drinksMilk = true;

        c1.showProfile();
        System.out.println("Drinks Milk: "+ c1.drinksMilk);
    }
}