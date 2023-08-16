package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q065 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] randomNums = new int[20];
		System.out.print("최대 범위: ");
		int maxNum = scan.nextInt();
		System.out.print("최소 범위: ");
		int minNum = scan.nextInt();
		String result = "";
		for (int i=0; i<randomNums.length; i++) {
			randomNums[i] = (int)((Math.random()*20)+1);
		}
		for (int j=0; j<randomNums.length; j++) {
			if (minNum < randomNums[j] && maxNum > randomNums[j]) {
				result = result +(randomNums[j] + ", ");
			}
		}
		System.out.printf("원본: %s\n", Arrays.toString(randomNums));
		System.out.printf("결과: %s\n", result);
		
	}
}