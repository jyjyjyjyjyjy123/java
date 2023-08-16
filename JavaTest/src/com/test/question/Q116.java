package com.test.question;

import java.io.File;
import java.util.HashMap;
import java.util.Set;

public class Q116 {
	public static void main(String[] args) {
		File dir1 = new File("C:\\class\\파일 디렉토리 문제\\동일 파일\\MusicA");
		File dir2 = new File("C:\\class\\파일 디렉토리 문제\\동일 파일\\MusicB");
		File[] list = dir1.listFiles();
		File[] list2 = dir2.listFiles();
		for (File f : list) {
			for (File f2 : list2) {
				if (f.getName().equals(f2.getName())) {
					System.out.println(f.getName());
				}
			}
		}		
	}
}
