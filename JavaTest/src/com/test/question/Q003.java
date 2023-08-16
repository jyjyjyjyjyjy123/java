package com.test.question;

import java.util.Scanner;

public class Q003 {
	public static void main(String[] args) {
		
		//요구사항] 사각형의 너비와 높이를 입력받아 넓이와 둘레를 출력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.print("너비 : ");
		int width = scan.nextInt();
		System.out.print("높이 : ");
		int height = scan.nextInt();
		int area;
		int round;
		area = width * height;
		round = (width + height) * 2;
		System.out.printf("사각형의 넓이는 %d㎠입니다.\n",area);
		System.out.printf("사각형의 둘레는 %dcm입니다.\n",round);
	
	}
	
}