package com.test.question;

import java.util.Scanner;

public class Q014 {
	public static void main(String[] args) {
		//요구사항] 지하철 탑승 소요 시간을 구하시오. 지나가는 역의 개수, 환승역의 횟수, 시간대를 전달 받아 총 걸리는 시간을 반환하는 메소드를 선언하시오.
		Scanner scan = new Scanner(System.in);
		System.out.print("역의 개수: ");
		int station = scan.nextInt();
		System.out.print("환승역의 횟수: ");
		int change = scan.nextInt();
		System.out.print("시간대(1. 평상시, 2. 출근시, 3. 퇴근시): ");
		int time = scan.nextInt();
		int result = getTime(station, change, time);
		System.out.printf("총 소요 시간은 %d분입니다.\n", result);
	}
	public static int getTime (int station, int change, int time) {
		int result = station * 2 + change * (time + 2);
		return result;
	}
}
