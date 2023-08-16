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

public class Q122 {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\파일 입출력 문제\\성적.dat"));
			String line = null;
			HashMap<String, String> test = new HashMap<String, String>();
			while ((line = reader.readLine()) != null) {
				String[] text = line.split(",");
				int kor = Integer.parseInt(text[1]);
				int eng = Integer.parseInt(text[2]);
				int math = Integer.parseInt(text[3]);
				
				if ((kor+eng+math)/3>60) {
					if (kor<40 || eng<40 || math<40) {						
						test.put(text[0],"불합격");
					}else {
						test.put(text[0],"합격");	
					}
				}else{						
					test.put(text[0],"불합격");
				}
			}
			Set<String> set = test.keySet();
			System.out.println("[합격]");
			for (String key : set) {
				if (test.get(key)=="합격") {
					System.out.println(key);
				}
			}
			System.out.println("[불합격]");
			for (String key : set) {
				if (test.get(key)=="불합격") {
					System.out.println(key);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
