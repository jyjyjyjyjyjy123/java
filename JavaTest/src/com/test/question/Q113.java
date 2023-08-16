package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q113 {
	public static void main(String[] args) {
		File file = new File("C:\\class\\파일 디렉토리 문제\\음악 파일");
		File[] list = file.listFiles();
		for (int i = 1; i < list.length; i++) {
			if (i/10 >= 10) {
				System.out.printf("[%d]%s\n",i,list[i-1].getName());
			} else if (i/10 > 0) {
				System.out.printf("[0%d]%s\n",i,list[i-1].getName());				
			} else {
				System.out.printf("[00%d]%s\n",i,list[i-1].getName());				
			}
		}
		
		
		
		
		
		
	}
}
