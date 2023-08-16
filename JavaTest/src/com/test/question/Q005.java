package com.test.question;

import java.util.Scanner;

public class Q005 {
	public static void main(String[] args) {
		
		//요구사항] 자전거가 있다. 자전거 바퀴는 지름이 26인치이다.
		//		 사용자가 페달을 밟은 횟수를 입력하면 자전거가 총 몇 m를 달렸는지 출력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.print("사용자가 페달을 밟은 횟수 : ");
		int pedal = scan.nextInt();
		double movement = 0.026 * 3.14 * 2.54 * pedal;
		System.out.printf("사용자가 총 %,d회 페달을 밟아 자전거가 총 %,.3fm를 달렸습니다.\n", pedal, movement*0.01);
	
	}
	
}
