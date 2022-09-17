package com.bootcamp.arraylist;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] myarray = new int[size];

        int elementCounter = 0;
        Warray arr = new Warray(size,myarray, elementCounter);

        System.out.println("Enter integer elements to add in your array: ");

        for(int i = 0 ; i<size; i++){
            int tempElement = sc.nextInt();
            arr.add(tempElement);
        }

        for(int i=0; i<arr.elementCount; i++){
            System.out.print("\n"+ "["+i+"]"+ myarray[i]);
        }

        System.out.print("\nEnter index of elements to remove from your array: ");
        int removeIndex = sc.nextInt();
        arr.remove(removeIndex);

        arr.getAll();

        System.out.print("\nEnter index to get the element: ");
        int getIndex = sc.nextInt();
        arr.get(getIndex);

    }
}
