package com.test.question;

import java.util.Scanner;

public class Q039 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("시작 숫자: ");
		int inputStart = scan.nextInt();
		System.out.println("종료 숫자: ");
		int inputEnd = scan.nextInt();
		int sum = 0;
		for (;inputStart <= inputEnd; inputStart++) {
			sum += inputStart;
			System.out.printf("%d",inputStart);
			if (inputEnd == inputStart) {
				System.out.printf(" = ");
				System.out.printf("%d",sum);
			} else {
				System.out.printf(" + ");
			}
		}
	}
}
