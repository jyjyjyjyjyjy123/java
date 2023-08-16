package com.test.question;

import java.util.Scanner;

public class Q030 {
	public static void main(String[] args) {
		//요구사항] 영문자 1개를 입력받아 대/소문자 변환을 한 뒤 출력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.println("문자: ");
		String input = scan.nextLine(); 
		int code = (int)input.charAt(0);
		if (code >= 97 && code <= 122) {
			System.out.printf("입력하신 소문자 %c의 대문자는 %c입니다.", code, code - 32);
		} else if (code >= 65 && code <= 90) {
			System.out.printf("입력하신 대문자 %c의 소문자는 %c입니다.", code, code + 32);
		} else {
			System.out.println("영문자만 입력하시오.");
		}
	}
}
