package com.test.question;

import java.util.Scanner;

public class Q088 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("입력: ");
		String text = scan.nextLine();
		
		String[] words = {"바보", "멍청이"};//찾고자하는 금지어
		
		int sum = 0; //금지어 개수를 저장하기 위한 변수

		String Asterisk = ""; //금지어의 글자 수 만큼 '*'를 저장하기 위한 변수
		
		for (int i=0; i<words.length; i++) {//금지어 개수 만큼 반복
			if(text.indexOf(words[i]) > -1) {//text에서 금지어를 발견한 경우
				Asterisk = "";//'*'개수 초기화
				for (int j = 0; j < words[i].length(); j++) {//금지어 수만큼 반복
					Asterisk += "*"; //금지어 수만큼 변수에 '*'추가
				}
				text = text.replace(words[i], Asterisk);
				//발견한 금지어를 '*'로 바꾸기
				sum+=1;//금지어 개수 추가
			}
			
		}
		System.out.println(text);
		System.out.printf("금지어를 %d회 마스킹했습니다.", sum);
	}
}
