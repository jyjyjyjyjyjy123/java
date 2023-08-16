package com.test.question;

import java.util.Scanner;

public class Q056 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int inputNum1 = scan.nextInt();
		System.out.print("두번째 숫자: ");
		int inputNum2 = scan.nextInt();
		m1(inputNum1);
		m1(inputNum2);
		System.out.printf("%d와 %d의 공약수: ",inputNum1,inputNum2);
		for (int i=1; i<=inputNum1; i++) {
			if (inputNum1%i == 0) {
				if (inputNum2%i == 0) {
					System.out.printf("%d,", i);
				}
			}
		}
	}

	private static void m1(int inputNum) {
		System.out.printf("%d의 약수: ",inputNum);
		for (int i=1; i<=inputNum; i++) {
			if (inputNum%i == 0) {
				System.out.printf("%d,",i);
			}
		}
		System.out.println();
	}
}