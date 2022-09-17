package com.bootcamp.vowels;

import java.util.Scanner;

public class VowelsSwitch{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character to check if it is a Vowel of not (e.g a,b,c) : ");
        char input = sc.next().charAt(0);

        switch (input){
            case 'a':
                System.out.println(" (a) Vowel Detected");
                break;
            case 'e':
                System.out.println(" (e) Vowel Detected");
                break;
            case 'i':
                System.out.println(" (i)  Vowel Detected");
                break;
            case 'o':
                System.out.println(" (o) Vowel Detected");
                break;
            case 'u':
                System.out.println(" (u) Vowel Detected");
                break;
            case default:
                System.out.println("Not a Vowel");
        }
    }
}