package com.test.question;

import java.util.Scanner;

public class Q076 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 점수: ");
		int kor = scan.nextInt();
		System.out.print("영어 점수: ");
		int eng = scan.nextInt();
		System.out.print("수학 점수: ");
		int math = scan.nextInt();
		
		
		String[][] score = new String[10][3];
		int subject;
		for (int j = 0; j<score[0].length; j++) { //3번 반복하도록
			if (j == 0) {
				subject = kor;
			} else if (j == 1) {
				subject = eng;
			} else {
				subject = math;
			}
			for(int i=score.length-(subject/10); i<score.length; i++) {//밑에서 부터 채우기
				//해당 과목을 10으로 나눠 그수만큼 반복하도록 설정
				score[i][j] = "■";
			}
			for(int i=0; i<score.length-(subject/10); i++) {
				//기본으로 들어가있는 null값을 지우기 위한 작업
				score[i][j] = "";
			}
		}
		
		//출력
		for(int  i=0;i<score.length; i++) {
			for (int j=0; j<score[0].length; j++) {
				System.out.printf("%5s", score[i][j]);
			}
			System.out.println();
		}
		System.out.println("------------------");
		System.out.println("  국어   영어   수학 ");
	}
}
