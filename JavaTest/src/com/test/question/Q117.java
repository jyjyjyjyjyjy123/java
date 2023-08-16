package com.test.question;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Q117 {
	public static void main(String[] args) {
		File dir = new File("C:\\class\\파일 디렉토리 문제\\폴더 삭제");
		
		delete(dir);
		System.out.println("종료");
	}

	private static void delete(File dir) {
		File[] list = dir.listFiles();
		
		for (File subfile : list) {
			if (subfile.isFile()) {
				subfile.delete();
			}
		}
		for (File subdir : list) {
			if (subdir.isDirectory()){
				delete(subdir);
			}
		}
		dir.delete();
	}
}
