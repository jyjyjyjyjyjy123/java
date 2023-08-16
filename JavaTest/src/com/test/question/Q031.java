package com.test.question;

import java.util.Scanner;

public class Q031 {
	public static void main(String[] args) {
		//요구사항] 숫자 5개를 입력받아 짝수와 홀수의 개수를 출력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int inputNum = scan.nextInt();
		System.out.print("숫자 입력: ");
		int inputNum2 = scan.nextInt();
		System.out.print("숫자 입력: ");
		int inputNum3 = scan.nextInt();
		System.out.print("숫자 입력: ");
		int inputNum4 = scan.nextInt();
		System.out.print("숫자 입력: ");
		int inputNum5 = scan.nextInt();
		
		int even = 0;
		int odd = 0;
		
		if (inputNum % 2 == 1) { odd += 1; } else {	even += 1; }
		if (inputNum2 % 2 == 1) { odd += 1; } else { even += 1; } 
		if (inputNum3 % 2 == 1) { odd += 1; } else { even += 1; }
		if (inputNum4 % 2 == 1) { odd += 1; } else { even += 1; }
		if (inputNum5 % 2 == 1) { odd += 1; } else { even += 1;	}
		
		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.", even, odd);
		if (even > odd) {
			System.out.printf("짝수가 홀수보다 %d개 더 많습니다", even - odd);
		} else {
			System.out.printf("홀수가 짝수보다 %d개 더 많습니다", odd - even);
		}
	}

}
