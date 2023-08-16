package com.test.question;

import java.util.Scanner;

public class Q026 {
	public static void main(String[] args) {
		//요구사항] 학생의 국어 점수를 입력받아 성적을 출력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.println("점수: ");
		int kor = scan.nextInt();
		String korRank = "";
		if (kor > 100 || kor < 0) {
			System.out.println("점수가 올바르지 않습니다. 0~100사이의 값을 입력하시오.");
		} else {
			if (kor >= 90) {
				korRank = "A";
			} else if (kor >= 80) {
				korRank = "B";
			} else if (kor >= 70) {
				korRank = "C";
			} else if (kor >= 60) {
				korRank = "D";
			} else {
				korRank = "F";
			}
			System.out.printf("입력한 %d점은 성적 %s입니다.\n", kor, korRank);
		}
	}
}
