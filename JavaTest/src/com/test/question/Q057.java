package com.test.question;

public class Q057 {
	public static void main(String[] args) {
		sum(10);
		sum(20);
		sum(30);
		sum(40);
		sum(50);
		sum(60);
		sum(70);
		sum(80);
		sum(90);
		sum(100);
		
	}

	private static void sum(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum +=i;
		}
		System.out.printf("%d ~ %3d: %4d\n",1,num,sum);
		
	}
}