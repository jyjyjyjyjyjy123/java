package com.test.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Q120 {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\파일 입출력 문제\\이름수정.dat"));
			String line = null;
			String name = "";			
			while ((line = reader.readLine()) != null) {
				name += String.format("%s\n",line);
			}
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\파일 입출력 문제\\이름수정.dat"));
			name = name.replaceAll("유재석", "메뚜기");
			System.out.println(name);
			writer.write(name);
			System.out.println("완료");
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
