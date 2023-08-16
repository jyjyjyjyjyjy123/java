package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q111 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("폴더: ");
		File dir = new File(scan.nextLine());
		System.out.print("확장자: ");
		String ex = scan.nextLine().toLowerCase();
		String[] list = dir.list();
		for (String file : list) {
			if (file.lastIndexOf(ex)>0) {
				System.out.println(file);
			}
		}
		
	}
}
