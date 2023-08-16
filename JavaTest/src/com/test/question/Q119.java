package com.test.question;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Q119 {
	public static void main(String[] args) {
		File dir = new File("C:\\class\\파일 디렉토리 문제\\직원");
		File[] list = dir.listFiles();
		for(File f : list) {
			String[]temp = f.getName().split("_");
			String name = temp[0];
			String year = temp[1];
			File nameDir = new File(dir.getAbsolutePath() + "\\" + name);
			nameDir.mkdir();
			File yearDir = new File(dir.getAbsolutePath() + "\\" + name + "\\" + year);
			yearDir.mkdir();
			File dest = new File(dir.getAbsolutePath() + "\\" + name + "\\" + year + "\\" + f.getName());
			f.renameTo(dest);
			
		}
		
	}
}
