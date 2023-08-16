package com.test.question;

import java.util.Scanner;

public class Q090 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("입력: ");
		String inputText = scan.nextLine();
		
		int sum = 0;//숫자의 합을 위한 변수
		
		for (int i = 0; i < inputText.length(); i++) {
			//입력 받은 문자의 수만큼 반복
			if (48 <= inputText.charAt(i) && inputText.charAt(i) <= 57) {
				//만약 해당 문장의 문자들중 숫자가 존재한다
				sum += inputText.charAt(i)-48;
				//sum에 해당 숫자 추가
				//-48하는 이유는 charAt로 뽑으면 아스키 코드로 나오는데 숫자 0 은 48부터 시작
				//그렇기 때문에 -48을 하면 해당 숫자가 나온다
			}
		}
		System.out.printf("문장에 존재하는 모든 숫자의 합은 %d입니다", sum);
	}
}
