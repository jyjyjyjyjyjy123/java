package com.test.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Q123 {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\파일 입출력 문제\\단일검색.dat"));
			Scanner scan = new Scanner(System.in);
			System.out.print("이름: ");
			String name = scan.nextLine();
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				String[] text = line.split(",");
				if (text[1].equals(name)) {
					System.out.printf("[%s]\n",text[1]);
					System.out.printf("번호: %s\n",text[0]);
					System.out.printf("주소: %s\n",text[2]);
					System.out.printf("전화:%s\n",text[3]);
					break;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
