package com.test.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Q121 {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\파일 입출력 문제\\숫자.dat"));
			String line = null;
			String text = "";			
			while ((line = reader.readLine()) != null) {
				text += String.format("%s\n",line);
			}
			for (int i = 0; i < 10; i++) {
				text = text.replaceAll(""+i, test(i));
			}
			System.out.println(text);
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\파일 입출력 문제\\숫자.dat"));
			writer.write(text);
			System.out.println("완료");
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	private static String test(int i) {
		switch (i+"") {
		case "0" :
			return "영";
		case "1":
			return "일";
		case "2":
			return "이";
		case "3":
			return "삼";
		case "4":
			return "사";
		case "5":
			return "오";
		case "6":
			return "육";
		case "7":
			return "칠";
		case "8":
			return "팔";
		case "9":
			return "구";
		default :
			return "";
		}
	}
}
