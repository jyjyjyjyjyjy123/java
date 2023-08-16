package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q112 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		File file1 = new File("C:\\class\\code\\java\\file\\AAA\\test.txt");
		File file2 = new File("C:\\class\\code\\java\\file\\BBB\\test.txt");
		System.out.println("파일 이동을 실행합니다.");
		System.out.print("같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n)");
		String yn = scan.nextLine();
		if (yn.equals("y")) {
			System.out.println(file2.delete());
			System.out.println(file1.renameTo(file2));
		}
		
		
		
		
		
	}
}
