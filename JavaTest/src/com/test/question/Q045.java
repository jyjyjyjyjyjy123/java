package com.test.question;

import java.util.Scanner;

public class Q045 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("최대 숫자: ");
		int maxCount = scan.nextInt();
		if (maxCount > 999) {
			System.out.println("최대 3자리까지만 입력하시오.");
		} else {
			for (int i = 1; i <= maxCount; i++) {
				if (10 < i && (i / 10) % 3 == 0) {
					System.out.printf(" 짝");
					if (i % 10 !=0 &&(i % 10) % 3 == 0) {
						System.out.printf("짝 ");
					}
				} else if (i % 10 !=0 &&(i % 10) % 3 == 0) {
					System.out.printf("짝 ");
				} else {
					System.out.printf("%d ", i);				
				}
			}
		}
	}
}
