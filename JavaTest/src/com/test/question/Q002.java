package com.test.question;

import java.util.Scanner;

public class Q002 {	
	public static void main(String[] args) {
		
		//요구사항] 숫자 2개를 입력받아 아래의 연산식을 출력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int input1 = scan.nextInt();
		System.out.print("두번째 숫자 : ");
		int input2 = scan.nextInt();
		System.out.printf("%,d + %,d = %,d\n", input1, input2, input1 + input2);
		System.out.printf("%,d - %,d = %,d\n", input1, input2, input1 - input2);
		System.out.printf("%,d * %,d = %,d\n", input1, input2, input1 * input2);
		System.out.printf("%,d / %,d = %,.1f\n", input1, input2, (double)input1 / input2);
		System.out.printf("%,d %% %,d = %,d\n", input1, input2, input1 % input2);
	
	}
	
}