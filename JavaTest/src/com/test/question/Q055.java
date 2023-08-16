package com.test.question;

public class Q055 {
	public static void main(String[] args) {
		int sum;
		for (int i = 2; i <= 100; i++) {
			sum = 0;
			for (int j = 1; j < i; j++) {
				if ( i % j == 0) {
					sum += j;
				}
			}
			if (i == sum) {
				System.out.printf("%d = [", i);
				for (int j = 1; j <= i-1; j++) {
					if ( i % j == 0) {
						System.out.printf("%d,", j);
					}
				}
				System.out.printf("]\n");
			}
		}
	}
}