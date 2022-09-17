package com.bootcamp.tasks;

public class Swapping {
	public static void main(String[] args) {
        withTemp();
        withoutTemp();
    }

    private static void withTemp() {
        int a = 10;
        int b = 20;
        System.out.println("A: " + a + "\t B: " + b);
        System.out.println("Swapping Values with Temp");
        int temp = a;
        a = b;
        b = temp;
        System.out.println("A: " + a + "\t B: " + b);
    }

    private static void withoutTemp() {
        System.out.println("============================");

        int a = 10;
        int b = 20;
        System.out.println("A: " + a + "\t B: " + b);
        System.out.println("Swapping Values without Temp");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("A: " + a + "\t B: " + b);
    }
}
