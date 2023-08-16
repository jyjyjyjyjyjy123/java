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

public class Q125 {
	public static void main(String[] args) {
		try {
			BufferedReader Reader = new BufferedReader(new FileReader("C:\\class\\파일 입출력 문제\\괄호.java"));
			Stack<String> stack = new Stack<String>();
			String text = "";
			String line = null;
			while ((line = Reader.readLine()) != null) {
				text += String.format("%s\n",line);
			}
			System.out.println(text);
			System.out.println();
			for (int i = 0; i < text.length(); i++) {
				if(text.charAt(i) == '{' || text.charAt(i) == '(') {
					stack.add("" + text.charAt(i));
				}
				if(text.charAt(i) == '}' || text.charAt(i) == ')') {
					stack.pop();
				}
			}
			if (stack.size() != 0) {
				System.out.println("올바른 소스입니다.");
			} else {				
				System.out.println("올바르지 않은 소스입니다");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
