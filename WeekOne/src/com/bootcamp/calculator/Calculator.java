package com.bootcamp.calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the experssion and hit enter (e.g 2 + 3 * 4 / 10 - 3):- ");
		String expression = sc.nextLine();
		String[] temp = expression.split(" ");
		
		//Extract Sequence of Operator and Operands from the String expression
		ArrayList<Character> operators = new ArrayList<Character>();
		ArrayList<Double> operands = new ArrayList<Double>();
		
		for(int i = 0 ; i < temp.length; i++) {
			String el = temp[i];
			if(el.charAt(0) == '+' || el.charAt(0) == '-' || el.charAt(0) == '/' || el.charAt(0) == '*') {
				operators.add(el.charAt(0));
			}
			else {
				operands.add(Double.parseDouble(el));
			}
		}
		
		double result = 0;
		
		System.out.println(operators+"\n");
		System.out.println(operands+"\n");
		
        
            
		for(int i=0; i<operators.size(); i++) {
		    if (operators.get(i) == '/'){
		    	result = operands.get(i) / operands.get(i+1);
		    	System.out.println(operands.get(i) + " / " + operands.get(i+1) +" = "+result);
		        operands.set(i, result);
		        operators.remove(i);
		        operands.remove(i+1);
		    }
		}

		
		for(int i=0; i<operators.size(); i++) {
		    if (operators.get(i) == '*'){
		    	result = operands.get(i) * operands.get(i+1);
		    	System.out.println(operands.get(i) + " * " + operands.get(i+1) +" = "+result);
		        operands.set(i, result);
		        operators.remove(i);
		        operands.remove(i+1);
		    }
		}

		
		for(int i=0; i<operators.size(); i++) {
		    if (operators.get(i) == '+'){
		    	result = operands.get(i) + operands.get(i+1);
		    	System.out.println(operands.get(i) + " + " + operands.get(i+1) +" = "+result);
		        operands.set(i, result);
		        operators.remove(i);
		        operands.remove(i+1);
		    }
		}

		
		for(int i=0; i<operators.size(); i++) {
		    if (operators.get(i) == '-'){
		    	result = operands.get(i) - operands.get(i+1);
		    	System.out.println(operands.get(i) + " - " + operands.get(i+1) +" = "+result);
		        operands.set(i, result);
		        operators.remove(i);
		        operands.remove(i+1);
		    }
		}

		
		System.out.println("\n"+expression+" = "+ result);
	}
	
	private static double operation(char op, double num1, double num2) {
		double result = 0;
		switch(op) {
		case '/':
			result = num1 / num2;
			System.out.println(num1 +" / "+ num2 +"= " +result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println(num1 +" * "+ num2 +"= " +result);

			break;
		case '+':
			result = num1 + num2;
			System.out.println(num1 +" + "+ num2 +"= " +result);

			break;
		case '-':
			result = num1 - num2;
			System.out.println(num1 +" - "+ num2 +"= " +result);

			break;
		}
		return result;
	}
}