package com.test.question;

import java.util.Scanner;

public class Q033 {
	public static void main(String[] args) {
		//요구사항] 년도를 입력받아 해당 년도가 '평년' 인지 '윤년' 인지 출력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력: ");
		int inputYear = scan.nextInt();
		String leapYear = "";
		if (inputYear % 4 == 0) {
			if (inputYear % 100 == 0) {
				if (inputYear % 400 == 0) {
					leapYear = "윤년";
				} else {
					leapYear = "평년";
				}
			} else {
				leapYear = "윤년";
			}
		} else {
			leapYear = "평년";
		}
		System.out.printf("%d년은 %s입니다.", inputYear, leapYear);
	}

}
