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
import java.util.Stack;

import com.test.java.collection.Student;

public class Q126 {
	public static void main(String[] args) {
		try {
			BufferedReader Reader = new BufferedReader(new FileReader("C:\\class\\파일 입출력 문제\\출결.dat"));
			HashMap<String, Integer> inCount = new HashMap<String, Integer>();
			HashMap<String, Integer> outCount = new HashMap<String, Integer>();
			String line = null;
			while ((line = Reader.readLine()) != null) {
				String[] text = line.split(",");
				String[] test = text[2].split(":");
				System.out.println(Integer.parseInt(test[0]));
				if (Integer.parseInt(test[0]) > 9) {
					if (inCount.containsKey(text[1]) == false) {
						inCount.put(text[1], 1);
					}else {
						inCount.put(text[1], inCount.get(text[1]) + 1);
					}
				}else if (Integer.parseInt(test[0]) == 9 && Integer.parseInt(test[1]) > 0) {
					if (inCount.containsKey(text[1]) == false) {
						inCount.put(text[1], 1);
					}else {
						inCount.put(text[1], inCount.get(text[1]) + 1);						
					}
				}
				test = text[3].split(":");
				if (Integer.parseInt(test[0]) < 18) {
					if (outCount.containsKey(text[1]) == false) {
						outCount.put(text[1], 1);
					}else {
						outCount.put(text[1], outCount.get(text[1]) + 1);
					}
				}
			}
			System.out.println("[이름] [지각] [조퇴]");
			Set<String> set = inCount.keySet();
			for (String key : set) {
				System.out.printf("%s %5d %5d\n", key, inCount.get(key), outCount.get(key));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
