package com.test.question;

import java.util.Scanner;

public class Q051 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("행: ");
		int input = scan.nextInt();
		int count = 1;
		for(int i=1;i<=input;i++) {
			for(int j=1; j<=input-i; j++) {
				System.out.printf(" ");
			}
			for(int k=1; k<=count; k++) {
				System.out.printf("*");
			}
			System.out.println();
			count += 2;
		}
	}
}
