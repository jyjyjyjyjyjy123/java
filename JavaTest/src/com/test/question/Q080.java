package com.test.question;

import java.util.Scanner;

public class Q080 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("문장 입력: ");
		String inputText = scan.nextLine();
		
		String text = "";//빈 String 변수 만들어두기
		
		for (int i = inputText.length()-1; i >= 0; i--) {
			//입력받은 문장을 뒤에서부터 한개씩 뽑아서 String 변수에 넣어주기
			text = text + inputText.charAt(i);
		}
		System.out.println("역순 결과: "+ text);
	}
}
