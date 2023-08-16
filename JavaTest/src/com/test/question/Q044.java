package com.test.question;

import java.util.Scanner;

public class Q044 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int inputNum = 0;
		String result = "";
		for (;;) {
			System.out.println("숫자: ");
			inputNum = scan.nextInt();
			if (inputNum % 2 == 0){
				result += " + ";
				result += inputNum;
				sum += inputNum;
			} else if (inputNum % 2 == 1){
				result += " - ";
				result += inputNum;
				sum -= inputNum;
			}
			if (sum >= 100) {
				result += " = ";
				result += sum;
				break;
			}			
		}
		System.out.printf("%s", result);
			
			
	}
	
}
