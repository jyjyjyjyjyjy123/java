package com.test.question;

import java.util.Scanner;

public class Q089 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("금액(원): ");
		String money = scan.nextLine();
		
		String result = "";//변화시킨 한글을 저장하기 위한 변수
		
		int count = 4 - money.length()%4;
		//천,백,십,일 단위로 반복하기에 4로 나누어 나온 나머지를 4에서 뺀다.
		//4에서 빼는 이유는 나머지를 바로 이용하게 되면 무조건 0번째 자리 부터 시작해서
		//단위가 어디든 '천'부터 시작하기 때문에 
		for (int i = 0; i < money.length()-1; i++) {
			//마지막 일의 자리는 필요없기때문에 
			//입력한 돈의 자릿수 -1 만큼 반복
			if((i + count)%4 == 0 && money.charAt(i) != '0') {
				//입력 받은 숫자의 위치 + count를 4로 나누었을때 0인 경우
				result +=  test(money,i);
				//입력받은 숫자의 한글을 추출하여 저장
				result += "천";
				//해당 자리의 단위 저장
			} else if ((i + count)%4  == 1 && money.charAt(i) != '0') {
				result +=  test(money,i);
				result += "백";
			} else if ((i + count)%4 == 2 && money.charAt(i) != '0') {
				result +=  test(money,i);
				result += "십";
			} else if ((i + count)%4 == 3 ) {
				result +=  test(money,i);
				result += "만";
			} 
		}
		result += test(money,money.length()-1);
		//마지막 숫자를 추출해서 저장
		result += "원";
		//단위 추가
		System.out.println(result);
	}		
	
	private static String test(String money, int i) {
		switch (money.charAt(i)) {
		case '1':
			return "일";
		case '2':
			return "이";
		case '3':
			return "삼";
		case '4':
			return "사";
		case '5':
			return "오";
		case '6':
			return "육";
		case '7':
			return "칠";
		case '8':
			return "팔";
		case '9':
			return "구";
		default :
			return "";
		}
	}
}
