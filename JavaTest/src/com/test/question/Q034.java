package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q034 {
	public static void main(String[] args) {
		//요구사항] 날짜를 입력받아 아래의 조건에 맞게 결과를 출력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.print("년: ");
		int inputYear = scan.nextInt();
		System.out.print("월: ");
		int inputMonth = scan.nextInt();
		System.out.print("일: ");
		int inputDate = scan.nextInt();
		
		Calendar inputDay = Calendar.getInstance();
		inputDay.set(inputYear, inputMonth - 1, inputDate);
		int week = inputDay.get(Calendar.DAY_OF_WEEK);
		String dayOff;
		if (week == 1 || week == 7) {
			dayOff = "휴일(토/일)";
			System.out.printf("입력하신 날짜는 %s입니다\n", dayOff);
			System.out.println("결과가 없습니다.");
		} else {
			week = 7 - week;
			dayOff = "평일";
			inputDay.add(Calendar.DATE, week);
			System.out.printf("입력하신 날짜는 %s입니다.\n", dayOff);
			System.out.println("해당 주의 토요일로 이동합니다.");
			System.out.printf("이동한 날짜는 %tF입니다.\n", inputDay);
		}
		
	}

}
