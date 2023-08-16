package com.test.question;

import java.util.Scanner;

public class Q027 {
	public static void main(String[] args) {
		//요구사항] 문자 1개를 입력받아 아래와 같이 출력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.print("문자: ");
		String input = scan.nextLine();
		int code = (int)input.charAt(0);
		if (input.equals("f") || input.equals("F")) {
			System.out.println("Father");
		} else if (input.equals("m") || input.equals("M")) {
			System.out.println("Mother");
		} else if (input.equals("s") || input.equals("S")) {
			System.out.println("Sister");
		} else if (input.equals("b") || input.equals("B")) {
			System.out.println("Brother");
		} else {
			System.out.println("입력한 문자가 올바르지 않습니다.");	
		}
	}
}
