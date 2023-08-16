package com.test.question;

public class Q060 {
	public static void main(String[] args) {
		int count = 0;
		int num = 0;
		int sum = 0;
		for (int i = 1; count <= 100; i = num) {
			num = count;
			count += i;
			if (count>100) {
				break;
			}
			System.out.printf("%d + ",count);
			sum += count;
		}
		System.out.printf("= %d", sum);
	}
}