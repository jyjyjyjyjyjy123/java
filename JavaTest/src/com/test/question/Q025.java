package com.test.question;

import java.util.Scanner;

public class Q025 {
	public static void main(String[] args) {
		//요구사항] 숫자 2개를 입력받아 큰수와 작은수를 출력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int inputNum = scan.nextInt();
		System.out.print("두번째 숫자: ");
		int inputNum2 = scan.nextInt();
		if (inputNum > inputNum2) {
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.\n",
								inputNum, inputNum2, inputNum - inputNum2);
		} else if (inputNum < inputNum2) {
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.\n",
								inputNum2, inputNum, inputNum2 - inputNum);
		} else{
			System.out.println("두 숫자는 동일합니다.");
		}
		
	}
}
