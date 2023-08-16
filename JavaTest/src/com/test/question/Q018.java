package com.test.question;

public class Q018 {
	public static void main(String[] args) {
		int count;
		count = positive(10);
		System.out.println("양수 :" + count);
		count = positive(10, 20);
		System.out.println("양수 :" + count);
		count = positive(10, 20, -30);
		System.out.println("양수 :" + count);
		count = positive(10, 20, -30, 40);
		System.out.println("양수 :" + count);
		count = positive(10, 20, -30, 40, 50);
		System.out.println("양수 :" + count);
	}

	private static int positive(int num) {
		int count = 0;
		count = num > 0 ? count + 1 : count ; 
		return count;
	}
	private static int positive(int num, int num2) {
		int count = 0;
		count = num > 0 ? count + 1 : count ; 
		count = num2 > 0 ? count + 1 : count ; 
		return count;
	}
	private static int positive(int num, int num2, int num3) {
		int count = 0;
		count = num > 0 ? count + 1 : count ; 
		count = num2 > 0 ? count + 1 : count ; 
		count = num3 > 0 ? count + 1 : count ; 
		return count;
	}
	private static int positive(int num, int num2, int num3, int num4) {
		int count = 0;
		count = num > 0 ? count + 1 : count ; 
		count = num2 > 0 ? count + 1 : count ; 
		count = num3 > 0 ? count + 1 : count ; 
		count = num4 > 0 ? count + 1 : count ; 
		return count;
	}
	private static int positive(int num, int num2, int num3, int num4, int num5) {
		int count = 0;
		count = num > 0 ? count + 1 : count ; 
		count = num2 > 0 ? count + 1 : count ; 
		count = num3 > 0 ? count + 1 : count ; 
		count = num4 > 0 ? count + 1 : count ; 
		count = num5 > 0 ? count + 1 : count ; 
		return count;
	}
	
}
