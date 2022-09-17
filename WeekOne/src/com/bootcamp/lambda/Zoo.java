package com.bootcamp.lambda;

import java.util.LinkedList;

public class Zoo {
    public static void main(String[] args) {
        LinkedList<String> zoo = new LinkedList<String>();
        zoo.add("Cat");
        zoo.add("Dog");
        zoo.add("Deer");
        zoo.add("Cow");
        zoo.add("Elephant");

        Animals a = () -> {
            System.out.println(zoo);
        };

        a.printAnimals();
    }
}
