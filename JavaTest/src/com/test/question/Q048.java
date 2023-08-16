package com.test.question;

import java.util.Scanner;

public class Q048 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력: ");
		int inputNum = scan.nextInt();
		int sumEven = 0;
		int sumOdd = 0;
		int num = 0;
		if (inputNum < 1) {
			System.out.println("int 양수만 입력하시오.");
		} else {
			for (int i = 1; inputNum != 0; i++) {
				num = inputNum % 10;
				inputNum = inputNum / 10;
				if (num%2==0) {
					sumEven += num;
				} else {
					sumOdd += num;
				}
			}
			System.out.printf("짝수의 합: %d\n", sumEven);
			System.out.printf("홀수의 합: %d\n", sumOdd);
		}
	}
}
