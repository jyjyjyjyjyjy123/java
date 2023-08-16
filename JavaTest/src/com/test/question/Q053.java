package com.test.question;

import java.util.Scanner;

public class Q053 {
	public static void main(String[] args) {
		for (int i=1; i<=9; i++) {
			for (int j=2; j<=5; j++) {
				System.out.printf("%d X %d = %2d    ", j, i, i*j);
			}
			System.out.println();
		}
		System.out.println();
		for (int i=1; i<=9; i++) {
			for (int j=6; j<=9; j++) {
				System.out.printf("%d X %d = %2d    ", j, i, i*j);
			}
			System.out.println();
		}
	}
}