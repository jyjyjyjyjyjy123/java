package com.test.question;

import java.util.Scanner;

public class Q086 {//87이랑 바뀜
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("문자: ");
		StringBuilder inputText = new StringBuilder(scan.nextLine());
		//입력받은 숫자를 StringBuilder에 저장 
		//append(뒤에 원하는 단어 삽입)와 insert(원하는 위치에 원하는 단어 삽입)를 쓰기위해 
		inputText.append(" ");//가장 뒷자리에 들어갈 경우를 위해 추가한 빈칸
		for (int i = inputText.length()-1; i > 0; i--) {//뒤에서 부터 반복
			for (int j = 0; j <= 25 ; j++) {//영문자 수 만큼
				if (inputText.charAt(i) == j + 65) {//대문자인 경우
					inputText.insert(i," ");//해당 위치에 빈칸 삽입
				}
			}
		}
		
		System.out.println(inputText);
	}
}
