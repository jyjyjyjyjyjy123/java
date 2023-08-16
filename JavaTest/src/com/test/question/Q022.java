package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q022 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("남자 이름: ");
		String manName = scan.nextLine();
		System.out.print("여자 이름: ");
		String girlName = scan.nextLine();
		System.out.print("만난날(년): ");
		int coupleYear = scan.nextInt();
		System.out.print("만난날(월): ");
		int coupleMonth = scan.nextInt();
		System.out.print("만난날(일): ");
		int coupleDate = scan.nextInt();
		Calendar coupleDays = Calendar.getInstance();
		coupleDays.set(coupleYear, coupleMonth-1, coupleDate);
		System.out.printf("%s과(와) %s의 기념일\n", manName, girlName);
		coupleDays.add(Calendar.DATE, 100);
		System.out.printf("100일: %tF\n", coupleDays);
		coupleDays.add(Calendar.DATE, 100);
		System.out.printf("200일: %tF\n", coupleDays);
		coupleDays.add(Calendar.DATE, 100);
		System.out.printf("300일: %tF\n", coupleDays);
		coupleDays.add(Calendar.DATE, 200);
		System.out.printf("500일: %tF\n", coupleDays);
		coupleDays.add(Calendar.DATE, 500);
		System.out.printf("1000일: %tF\n", coupleDays);
				
	}

}
