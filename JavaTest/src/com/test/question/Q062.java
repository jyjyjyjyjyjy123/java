package com.test.question;

import java.util.Scanner;

public class Q062 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 수: ");
		int input = scan.nextInt();
		scan.nextLine();
		String[] names = new String[input];
		for (int i = 0;i<names.length;i++) {
			System.out.print("학생명: ");
			names[i] = scan.nextLine();
		}
		System.out.printf("입력한 학생은 총 %d명입니다.\n",input);
		for (int j = 0; j<names.length; j++) {
			System.out.printf("%d. %s\n", j+1, names[j]);
		}
	}
}