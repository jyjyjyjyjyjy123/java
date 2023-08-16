package com.test.question;

import java.util.Scanner;

public class Q082 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자: ");
		String inputNum = scan.nextLine();
		
		int sum = 0;//수의 합을 위한 변수
		for (int i = 0; i < inputNum.length(); i++) {//입력받은 숫자의 수만큼 반복
			sum = sum + (int)inputNum.charAt(i) - 48;
			//각 자리의 수를 charAt로 뽑으면 아스키 코드로 나오는데 
			//숫자 0의 아스키 코드는 48부터 시작하기때문에 
			//charAt로 뽑혀진 숫자는 -48을 해주면 해당 숫자가 나오게 된다.
			if (i == inputNum.length()-1) {
				//마지막 숫자일 경우
				System.out.printf(" %c = %d",inputNum.charAt(i), sum);	
				//출력시 뒤에 =과 수의 합을 함께 출력
			}else {
				System.out.printf(" %c +",inputNum.charAt(i));
				//출력시 마지막을 제외한 숫자는 뒤에 +를 붙여 출력
			}
		}
	}
}
