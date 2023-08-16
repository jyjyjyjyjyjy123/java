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

import com.test.java.collection.Student;

public class Q124 {
	public static void main(String[] args) {
		try {
			BufferedReader userReader = new BufferedReader(new FileReader("C:\\class\\파일 입출력 문제\\검색_회원.dat"));
			BufferedReader orderReader = new BufferedReader(new FileReader("C:\\class\\파일 입출력 문제\\검색_주문.dat"));
			Scanner scan = new Scanner(System.in);
			
			System.out.print("이름: ");
			String name = scan.nextLine();
			
			String line = null;
			String[] user = null;
			String[] order = null;
			
			//황길수
			while ((line = userReader.readLine()) != null) {
				user = line.split(",");
				if (user[1].equals(name)) {
					break;
				}
			}
			
			System.out.println("=============구매내역=============");
			System.out.println("[번호] [이름] [상품명] [개수] [배송지]");
			
			while ((line = orderReader.readLine()) != null) {
				order = line.split(",");
				if (order[3].equals(user[0])) {
					System.out.printf("%5s %3s %5s %5s %10s\n",user[0], user[1], order[1], order[2], user[2]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
