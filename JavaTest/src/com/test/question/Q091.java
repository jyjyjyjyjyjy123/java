package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q091 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("입력: ");
		String inputText = scan.nextLine();
		inputText = inputText.replace(" ","");//모든 공백을 제거
		//trim을 써도괜찮지만 앞뒤의 빈공백은 안없어지기에 위와 같이
		String op = "";//연산자 저장용
		int result = 0;
		String[] text = {"",""};//두 피연산자를 나누기 위한 공간
		int num1 = 0;//피연산자1
		int num2 = 0;//피연산자2
		if (inputText.contains("+")) {//연산자를 구분하기 위한 if 문
			op = "+";
		} else if (inputText.contains("-")){
			op = "-";
		} else if (inputText.contains("*")){
			op = "*";
		} else if (inputText.contains("/")){
			op = "/";
		} else if (inputText.contains("%")){
			op = "%";
		}
		if (op.equals("")) {//만약 연산자가 없을경우 
			System.out.println("연산자가 올바르지 않습니다.");
		} else {//연산자가 있을경우
			text = inputText.split("\\"+op);//연산자를 기준으로 나누기
			if (!text.equals("")) {
				num1 = Integer.parseInt(text[0]);
				num2 = Integer.parseInt(text[1]);
				switch (op) {
				case "+":
					result = num1 + num2;
					break;
				case "-":
					result = num1 - num2;
					break;
				case "*":
					result = num1 * num2;
					break;
				case "/":
					result = num1 / num2;
					break;
				case "%":
					result = num1 % num2;
					break;
				}
			}else {
				System.out.println("피연산자가 부족합니다.");
			}
				
				System.out.printf("%d %s %d = %d",num1,op,num2,result);
		}

	}
}
