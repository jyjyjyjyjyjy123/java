package com.test.question;

import java.util.Scanner;

public class Q050 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("행: ");
		int input = scan.nextInt();
		for(int i=1;i<=input;i++) {
			for(int j=1; j<=input-i; j++) {
				System.out.printf(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
