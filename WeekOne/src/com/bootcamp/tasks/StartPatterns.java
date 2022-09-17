package com.bootcamp.tasks;

public class StartPatterns {

    private static void rightTriangle() {
        for(int i=0; i<5; i++){
            for (int k=0; k<=i; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    private static void leftTriangle() {
    	for(int i=1; i<=5; i++){
            for (int k=1; k<=5-i; k++){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }

    private static void rightTriangleInverted() {
        for(int i=5; i>=0; i--){
            for (int k=0; k<=i; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void triangle() {
        for (int i=0; i<5; i++) {

            for (int j=5-i; j>1; j--) {
                System.out.print(" ");
            }

            for (int j=0; j<=i; j++ ) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("\nRight");
        rightTriangle();
        System.out.println("\nLeft");
        leftTriangle();
        System.out.println("\nRight Inverted");
        rightTriangleInverted();
        System.out.println("\nTriangle");
        triangle();

    }


}