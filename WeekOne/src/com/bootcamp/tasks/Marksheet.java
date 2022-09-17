package com.bootcamp.tasks;

import java.util.HashMap;
import java.util.Scanner;

public class Marksheet {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Full Name: ");
        String full_name = sc.nextLine();
        System.out.print("Enter the name of your Institute: ");
        String institute_name = sc.nextLine();
        System.out.print("Enter your Degree Title: ");
        String degree_name = sc.nextLine();
        System.out.print("Enter your passing year: ");
        int passing_year = sc.nextInt();
        System.out.print("Enter your total courses: ");
        int total_courses = sc.nextInt();
        HashMap<String, Integer> marks = new HashMap<String, Integer>();
        for (int i = 0; i < total_courses; i++) {
            System.out.print("Enter Course Code of " + (i + 1) + " course: ");
            String subject = sc.next();
            System.out.print("Enter score of " + subject + ": ");
            Integer score = sc.nextInt();
            marks.put(subject, score);
        }

        System.out.println("===================================================");

        System.out.println("Name: "+full_name + " \tInstitute: "+institute_name + " \nProgram: "+ degree_name + "\tYear:" + passing_year);
        System.out.println("----------------------------------------");

        int total_marks = 0;
        for (String i : marks.keySet()) {
            total_marks += marks.get(i);
            System.out.println("|\t"+ i + " \t \t " + marks.get(i)+"\t|");
            System.out.println("----------------------------------------");

        }
        System.out.println("Total Marks: " + total_marks);
        double percentage = total_marks/total_courses;
        System.out.println("Percentage: " + percentage);
        if(percentage >= 85) {
            System.out.println("Grade: A");
        }else if(percentage >= 75) {
            System.out.println("Grade: B");
        }else if(percentage <= 60) {
            System.out.println("Grade: C");
        }else if(percentage < 50) {
            System.out.println("Grade: F");
        }
        System.out.println("===================================================");
	}
}
