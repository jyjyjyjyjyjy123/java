package com.test.question;

import java.util.Scanner;

public class Q046 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String result = "";
		int inputNum;
		for (int i = 1; i<=10; i++) {
			System.out.print("숫자: ");
			inputNum = scan.nextInt();
			result +=m1(inputNum);
		}
		System.out.printf("%s", result);
	}

	private static String m1(int inputNum) {
		switch (inputNum) {
		case 1:
			return "일";
		case 2:
			return "이";
		case 3:
			return "삼";
		case 4:
			return "사";
		case 5:
			return "오";
		case 6:
			return "육";
		case 7:
			return "칠";
		case 8:
			return "팔";
		case 9:
			return "구";	
		default:
			return null;
		}
	}
}
