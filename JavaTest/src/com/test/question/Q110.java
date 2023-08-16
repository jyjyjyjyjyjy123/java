package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q110 {
	public static void main(String[] args) {
		String[] b = {"B", "KB", "MB", "GB", "TB"};
		Scanner scan = new Scanner(System.in);
		System.out.print("파일 경로: ");
		File file = new File(scan.nextLine());
		String ex = file.getName();
		double fileLength = file.length();
		System.out.printf("파일명: %s\n", file.getName());
		System.out.printf("종류: %s\n", ex.substring(ex.indexOf(".")));
		for (int i = 0; i < 5; i++) {
			if (fileLength>1024) {
				fileLength = fileLength/1024;
			}else {
				System.out.printf("파일 크기: %.1f%s\n", fileLength, b[i]);
				break;
			}
		}
		
		
	}
}
