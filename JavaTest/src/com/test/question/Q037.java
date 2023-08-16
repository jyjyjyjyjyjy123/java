package com.test.question;

import java.util.Scanner;

public class Q037 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자: ");
		int inputNum = scan.nextInt();
		int sum = 0;
		for (int i = 1; i<=inputNum; i++) {
			sum += i;
		}
		System.out.printf("1 ~ %d = %d", inputNum, sum);
	}
}
