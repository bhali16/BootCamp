package com.bootcamp.vowels;

import java.util.ArrayList;
import java.util.Scanner;

public class VowelsTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character to check if it is a Vowel of not (e.g a,b,c) : ");
        char input = sc.next().charAt(0);
        ArrayList vowels = new ArrayList();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        String result = (vowels.contains(input)) ? "Vowel Detected" : "Invalid Character";
        System.out.println(result);
    }
}
