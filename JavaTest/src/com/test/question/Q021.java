package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q021 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("태어난 년도: ");
		int birthYear = scan.nextInt();
		Calendar now = Calendar.getInstance();
		int age = now.get(Calendar.YEAR) - birthYear + 1;
		System.out.printf("나이: %d\n", age);
	}

}
