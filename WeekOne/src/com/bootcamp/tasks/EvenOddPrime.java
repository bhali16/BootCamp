package com.bootcamp.tasks;

public class EvenOddPrime {
	
	public static void main(String[] args) {
		prime(7);
		prime(29);
		prime(20);
		evenOdd(23);
		evenOdd(320);
	}

	private static void prime(int num) {
		boolean isPrime = true;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				isPrime = false;
				break;
			}
		}
		String result = (isPrime) ? "Prime Number" : "Not a Prime Number";
		System.out.println(num+ " : " + result);
	}

	private static void evenOdd(int num) {
		boolean isEven = false;
		if(num%2==0) {
			isEven = true;
		}
		String result = (isEven) ? "Number is Even" : "Number is Odd";
		System.out.println(num+ " : " + result);
	}
}
