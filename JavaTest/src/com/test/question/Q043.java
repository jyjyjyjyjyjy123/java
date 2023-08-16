package com.test.question;

import java.util.Scanner;

public class Q043 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int comNum = (int)(Math.random()*10)+1;
		int count = 0;
		System.out.println("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.");
		for (;;) {
			System.out.println("숫자: ");
			int inputNum = scan.nextInt();
			count ++;
			if (comNum == inputNum) {
				System.out.printf("컴퓨터가 생각한 숫자는 %d입니다\n", comNum);
				System.out.printf("정답을 맞추는데 시도한 횟수는 %d입니다\n\n", count);
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("틀렸습니다.");
			}
		}
	}
}
