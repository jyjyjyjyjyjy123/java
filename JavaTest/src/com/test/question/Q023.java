package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q023 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("아빠 생일(년): ");
		int fatherBrithdayYear = scan.nextInt();
		System.out.print("아빠 생일(월): ");
		int fatherBrithdayMonth = scan.nextInt();
		System.out.print("아빠 생일(일): ");
		int fatherBrithdayDate = scan.nextInt();
		System.out.print("딸 생일(년): ");
		int daughterBrithdayYear = scan.nextInt();
		System.out.print("딸 생일(월): ");
		int daughterBrithdayMonth = scan.nextInt();
		System.out.print("딸 생일(일): ");
		int daughterBrithdayDate = scan.nextInt();
		
		Calendar father = Calendar.getInstance();
		Calendar daughter = Calendar.getInstance();
		father.set(fatherBrithdayYear, fatherBrithdayMonth - 1, fatherBrithdayDate);
		daughter.set(daughterBrithdayYear, daughterBrithdayMonth - 1, daughterBrithdayDate);
		long fatherTick = father.getTimeInMillis();
		long daughterTick = daughter.getTimeInMillis();
		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.",
							(daughterTick - fatherTick) / 1000 / 60 / 60 / 24);
		
	}

}
