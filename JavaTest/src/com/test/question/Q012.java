package com.test.question;

import java.util.Scanner;

public class Q012 {
	public static void main(String[] args) {
		//요구사항] 숫자를 전달하면 '짝수' 혹은 '홀수' 라는 단어를 반환하는 메소드를 선언하시오.
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = scan.nextInt();
		String result = getNumber(num);
		System.out.printf("입력하신 숫자 %d는(은) %s입니다.\n", num, result);
	}
	public static String getNumber(int num) {
		String result = (num%2) == 1 ? "홀수" : "짝수";
		return result;
	}
}
