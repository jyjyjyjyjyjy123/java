package com.test.question;

public class Q010 {
	public static void main(String[] args) {
		//요구사항] 숫자 1개를 전달하면 4자리로 출력하는 메소드를 선언하시오.
		digit(1);
		digit(12);
		digit(321);
		digit(5678);
		digit(98765);
		
	}
	public static void digit(int num) {
		String tranceNum = ""; 
		tranceNum = num >= 1000 ? "" + num : num >= 100 ? "0"+num : num >= 10 ? "00" + num : "000" + num;
		System.out.printf("%d -> %s\n", num, tranceNum);
	}
}
