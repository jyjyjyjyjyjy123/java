package com.test.question;

import java.util.Scanner;

public class Q007 {
	
	public static void main(String[] args) {
		
		//요구사항] 영문 소문자를 1글자 입력받은 후 대문자로 변환해서 출력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		String input = scan.nextLine();
		int code = (int)input.charAt(0);
		System.out.printf("소문자 '%c'의 대문자는 '%c'입니다.\n", code, code - 32);
	}

}
