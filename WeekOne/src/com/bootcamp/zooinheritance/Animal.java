package com.bootcamp.zooinheritance;
public class Animal {
    public String name;
    public String sound;
    public int age;

    public void showProfile(){
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
        System.out.println("Sound:" + this.sound);
    }

}
