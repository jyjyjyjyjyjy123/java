package com.test.question;

import java.io.File;
import java.util.HashMap;
import java.util.Set;

public class Q114 {
	public static void main(String[] args) {
		File file = new File("C:\\class\\파일 디렉토리 문제\\확장자별 카운트");
		File[] list = file.listFiles();
		HashMap<String,Integer> count = new HashMap<String,Integer>(); 
		for (File f : list) {
			String[] temp = f.getName().split("\\.");
			String ex = temp[temp.length-1].toLowerCase();
			if (count.get(ex)==null) {
				count.put(ex, 1);
			} else {
				count.put(ex, count.get(ex)+1);				
			}
		}
		Set<String> set = count.keySet();
		System.out.println(set);
		for (String key : set) {
			System.out.println(key + ": " + count.get(key)+"개");
		}
		
		
		
		
		
		
	}
}
