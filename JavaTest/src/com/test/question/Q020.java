package com.test.question;

import java.util.Calendar;

public class Q020 {
	public static void main(String[] args) {
		Calendar baby = Calendar.getInstance();
		baby.add(Calendar.DATE, 100);
		System.out.printf("백일 : %tF\n", baby);
		baby = Calendar.getInstance();
		baby.add(Calendar.YEAR, 1);
		System.out.printf("첫돌 : %tF\n", baby);
		
	}
}
