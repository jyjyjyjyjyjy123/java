package com.test.question;

import java.util.Scanner;

public class Q036 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("시작 숫자: ");
		int inputStart = scan.nextInt();
		System.out.println("종료 숫자: ");
		int inputEnd = scan.nextInt();
		System.out.println("증감치: ");
		int inputUp = scan.nextInt();
		for (; inputStart <= inputEnd; inputStart += inputUp) {
			System.out.println(inputStart);
		}
	}
}
