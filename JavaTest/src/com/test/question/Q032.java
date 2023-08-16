package com.test.question;

import java.util.Scanner;

public class Q032 {
	public static void main(String[] args) {
		//요구사항] 주차 요금을 계산하시오.
		Scanner scan = new Scanner(System.in);
		System.out.println("[들어온 시간]");
		System.out.print("시: ");
		int inHour = scan.nextInt();
		System.out.print("분: ");
		int inMin = scan.nextInt();
		
		System.out.println("[나간 시간]");
		System.out.print("시: ");
		int outHour = scan.nextInt();
		System.out.print("분: ");
		int outMin = scan.nextInt();
		
		int hour = outHour - inHour;
		int min = outMin - inMin;
			
		if (min < 0) {
			if (hour != 0) {
				hour = hour - 1;
				min = 60 + min ;
				if (hour < 0) {
					hour = 24 + hour;
				}
			}
		}
		hour = hour * 60;
		int result = min + hour;
		System.out.printf("주차 요금은 %d원입니다.\n", (result - 30) / 10 * 2000);

		
	}

}
