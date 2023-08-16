package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q024 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("음식을 받기 원하는 시각");
		System.out.print("시: ");
		int inputHour = scan.nextInt();
		System.out.print("분: ");
		int inputMin = scan.nextInt();
		if (inputHour < 23) {
			goodTime(inputHour, inputMin);
		}
		else {
			badTime();
		}
	}

	private static void badTime() {
		System.out.println("오후 11시 이전에만 가능합니다.");

	}

	private static void goodTime(int inputHour, int inputMin) {
		Calendar inputTime = Calendar.getInstance();
		inputTime.set(Calendar.HOUR_OF_DAY, inputHour);
		inputTime.set(Calendar.MINUTE, inputMin);
		inputTime.add(Calendar.MINUTE, -10);		
		System.out.printf("짜장면: %d시 %d분\n",
							inputTime.get(Calendar.HOUR_OF_DAY),
							inputTime.get(Calendar.MINUTE));
		inputTime.add(Calendar.MINUTE, -8);
		System.out.printf("치킨: %d시 %d분\n",
							inputTime.get(Calendar.HOUR_OF_DAY),
							inputTime.get(Calendar.MINUTE));
		inputTime.add(Calendar.MINUTE, -7);
		System.out.printf("피자: %d시 %d분\n",
							inputTime.get(Calendar.HOUR_OF_DAY),
							inputTime.get(Calendar.MINUTE));
		
	}

}
