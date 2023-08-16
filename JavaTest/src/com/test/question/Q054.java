package com.test.question;

public class Q054 {
	public static void main(String[] args) {
		int sum;
		for (int i = 2; i <= 100; i++) {
			sum = 1;
			for (int j = 2; j <= i-1; j++) {
				sum = sum * i%j;
			}
			if (sum != 0) {
				System.out.printf("%d, ", i);
			}
		}
	}
}