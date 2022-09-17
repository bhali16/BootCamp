package com.bootcamp.tasks;

public class BubbleSort {
	public static void main(String[] args) {
		int[] numbers = {10,33,20,47,98,12,29,84,56,22};
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=1; j<numbers.length; j++) {
				if(numbers[j]<numbers[j-1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j-1];
					numbers[j-1] = temp;
				}
			}
		}
		
		System.out.print("Sorted Numbers: ");
		for(int p=0; p<numbers.length; p++) {
			System.out.print(numbers[p] + " ");
		}
	}
}
