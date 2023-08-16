package com.test.question;

import java.util.Scanner;

public class Q040 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("시작 숫자: ");
		int inputStart = scan.nextInt();
		System.out.println("종료 숫자: ");
		int inputEnd = scan.nextInt();
		int sum = 0;
		int count = 0;
		for (;inputStart <= inputEnd; inputStart++) {
			count ++;
			System.out.printf("%d",inputStart);
			if (inputEnd == inputStart) {
				if (count%2 == 1){
					sum += inputStart;
				} else if (count%2 == 0){
					sum -= inputStart;
					}
				System.out.printf(" = ");
				System.out.printf("%d",sum);
			} else if (count%2 == 1){
				System.out.printf(" - ");
				sum += inputStart;
			} else if (count%2 == 0){
				System.out.printf(" + ");
				sum -= inputStart;
		}
		}
	}
}
