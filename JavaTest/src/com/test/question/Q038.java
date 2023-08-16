package com.test.question;

import java.util.Scanner;

public class Q038 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("입력 횟수: ");
		int inputCount = scan.nextInt();
		int sumEven = 0;
		int sumOdd = 0;
		int countEven = 0;
		int countOdd = 0;
		for (int i=1;i<=inputCount;i++) {
			System.out.println("숫자: ");
			int inputNum = scan.nextInt();
			if (inputNum % 2 == 0) {
				sumEven += inputNum;
				countEven ++;
			} else {
				sumOdd += inputNum;
				countOdd ++;				
			}
		}
		System.out.printf("짝수 %d개의 합: %d\n",countEven, sumEven);
		System.out.printf("홀수 %d개의 합: %d\n",countOdd, sumOdd);
	}
}
