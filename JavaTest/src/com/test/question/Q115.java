package com.test.question;

import java.io.File;
import java.util.HashMap;
import java.util.Set;

public class Q115 {
	public static void main(String[] args) {
		File dir = new File("C:\\class\\파일 디렉토리 문제\\파일 제거");
		File[] list = dir.listFiles();
		for (File f : list) {
			File file = new File("C:\\class\\파일 디렉토리 문제\\파일 제거" + "\\" + f.getName());
			if (file.length() == 0) {
				System.out.println(file.delete());
			}
		}
		System.out.println("종료");
		
	}
}
