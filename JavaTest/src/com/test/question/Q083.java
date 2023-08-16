package com.test.question;

import java.util.Scanner;

public class Q083 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = new String[10];
		int index = 0;
		//확장자 추출을 위한 변수
		int mp3 = 0;
		int jpg = 0;
		int java = 0;
		int hwp = 0;
		int doc = 0;
		//각 확장자의 개수를 저장하기 위한 변수들
		for (int i = 0; i < input.length; i++) {//입력받을 파일수 만큼 반복
			System.out.print("파일명: ");
			input[i] = scan.nextLine();
			index = input[i].lastIndexOf(".");//입력받은 파일명의'.'의 위치를 추출
			switch (input[i].substring(index)) {
			//입력받은 파일명을 '.'부터 뒤의 확장자를 출력
			case ".mp3":
				mp3 += 1;
				continue;
			case ".jpg":
				jpg += 1;
				continue;
			case ".java":
				java += 1;
				continue;
			case ".hwp":
				hwp += 1;
				continue;
			case ".doc":
				doc += 1;
				continue;
			default ://만약 지정된 확장자가 아닌경우
				System.out.println("제한된 확장자 입니다.");
				i--;//잘못된 파일명의 자리에서 다시 시작
				continue;
			}
					
		}
		System.out.printf("mp3 : %d개\n",mp3);
		System.out.printf("jpg : %d개\n", jpg);
		System.out.printf("java : %d개\n", java);
		System.out.printf("hwp : %d개\n", hwp);
		System.out.printf("doc : %d개\n", doc);
		
	}
}
