package com.bootcamp.tasks;

import java.util.Scanner;

public class Fabinocci {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of series : ");
        int size = sc.nextInt();
        int num1 = 0;
        int num2 = 1;

        int[] series = new int[size];
        series[0] = num1;
        series[1] = num2;
        for (int i  = 2 ; i< size; i++){
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            series[i] = num3;
        }
        
        for(int n : series){
            System.out.print(n + " ");
        }
    }
}
