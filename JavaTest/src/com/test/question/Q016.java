package com.test.question;

public class Q016 {
	public static void main(String[] args) {
		//요구사항] 인자로 받은 숫자들의 합을 구하는 메소드를 선언하시오.
		
		sum(10);
		sum(10, 20);
		sum(10, 20, 30);
		sum(10, 20, 30, 40);
		sum(10, 20, 30, 40, 50);
		
	}//main

	private static void sum(int num) {
		int sum = num;
		System.out.printf("%d = %d\n", num, sum);
	}
	private static void sum(int num, int num2) {
		int sum = num + num2;
		System.out.printf("%d + %d = %d\n", num, num2, sum);
	}
	private static void sum(int num, int num2, int num3) {
		int sum = num + num2 + num3;
		System.out.printf("%d + %d + %d = %d\n", num, num2, num3, sum);
	}
	private static void sum(int num, int num2, int num3, int num4) {
		int sum = num + num2 + num3 + num4;
		System.out.printf("%d + %d + %d + %d = %d\n", num, num2, num3, num4, sum);
	}
	private static void sum(int num, int num2, int num3, int num4, int num5) {
		int sum = num + num2 + num3 + num4 + num5;
		System.out.printf("%d + %d + %d + %d + %d = %d\n", num, num2, num3, num4, num5, sum);
	}
	
}
