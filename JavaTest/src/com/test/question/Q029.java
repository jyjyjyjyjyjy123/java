package com.test.question;

import java.util.Scanner;

public class Q029 {
	public static void main(String[] args) {
		//요구사항] 숫자 2개와 연산자 1개를 입력받아 연산 과정과 결과를 출력하시오.
		Scanner scan = new Scanner (System.in);
		
		System.out.print("첫번째 숫자: ");
		int inputNum = scan.nextInt();
		System.out.print("두번째 숫자: ");
		int inputNum2 = scan.nextInt();
//		scan.skip("\r\n");
		scan.nextLine();
		System.out.print("연산자: ");
		String inputOp = scan.nextLine();
	
		
		if (inputOp.equals("+")) {
			System.out.printf("%d %s %d = %d\n", 
								inputNum,
								inputOp,
								inputNum2,
								inputNum + inputNum2);
		} else if (inputOp.equals("-")) {
			System.out.printf("%d %s %d = %d\n", 
								inputNum,
								inputOp,
								inputNum2,
								inputNum - inputNum2);
		} else if (inputOp.equals("*")) {
			System.out.printf("%d %s %d = %d\n", 
								inputNum,
								inputOp,
								inputNum2,
								inputNum * inputNum2);
		} else if (inputOp.equals("/")) {
			System.out.printf("%d %s %d = %.1f\n", 
								inputNum,
								inputOp,
								inputNum2,
								(double)inputNum / inputNum2);
		} else if (inputOp.equals("%")) {
			System.out.printf("%d %s %d = %d\n", 
								inputNum,
								inputOp,
								inputNum2,
								inputNum % inputNum2);
		} else {
			System.out.println("연산이 불가능합니다.");
		}
		
	}
}
