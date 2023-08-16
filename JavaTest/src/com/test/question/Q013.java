package com.test.question;

import java.util.Scanner;

public class Q013 {
	public static void main(String[] args) {
		//요구사항] 국어, 영어, 수학 점수를 전달하면 '합격' 혹은 '불합격'이라는 단어를 반환하는 메소드를 선언하시오.
		Scanner scan = new Scanner(System.in);
		System.out.print("국어: ");
		int kor = scan.nextInt();
		System.out.print("영어: ");
		int eng = scan.nextInt();
		System.out.print("수학: ");
		int math = scan.nextInt();
		String result = test(kor, eng, math);
		System.out.println(result + "입니다.");
	
	}
	public static String test(int kor, int eng, int math) {
		int avg = (kor + eng + math) / 3;
		String result = "";
		result = kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "합격" : "불합격";
		return result;
	}

}
