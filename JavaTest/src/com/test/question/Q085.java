package com.test.question;

import java.util.Scanner;

public class Q085 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("주민등록번호: ");
		String jumin = scan.nextLine();
		
		boolean result = true; //잘못된 주민을 거르기 위한 boolean 변수
		if (jumin.charAt(2) == '1' || jumin.charAt(2) == '0') {
		}else {
			result = false;
		}
		if(jumin.charAt(2) == '1') {
			if (47 < (int)jumin.charAt(3) && (int)jumin.charAt(3) < 51) {
			} else {
				result = false;
			}
		}
		//12월 이하를 거르기 위한 if문
		//앞자리가 1,0이 아니거나 1이더라도 뒤의 숫자가 3이상일 경우 boolean변수에 false 를 저장
		if (47 < (int)jumin.charAt(4) && jumin.charAt(4) < 52) {
		} else {
			result = false;
		}
		if (jumin.charAt(4) == '3') {
			if (47 < (int)jumin.charAt(5) && jumin.charAt(5) <50) {
			} else {
				result = false;
			}
		}
		//31일 이하를 거르기 위한 if문
		//앞자리가 1~3이 아니거나 3이더라도 2이상 일경우 false를 저장
		if (result == true) {
			System.out.println("올바른 주민등록번호입니다.");
		} else {
			System.out.println("올바르지 않은 주민등록번호입니다.");
		}
		
	}
}
