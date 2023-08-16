package com.test.question;

import java.util.Scanner;

public class Q081 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이메일: ");
		String inputText = scan.nextLine();
		
		String[] mail = inputText.split("@");
		//입력받은 이메일을 split을 통해 @을 기준으로 아이디와 도메인으로 나누어 각각 저장
		System.out.println("아이디: "+mail[0]);
		System.out.println("도메인: "+mail[1]);
	}
}
