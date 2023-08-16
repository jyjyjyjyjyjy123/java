package com.test.question;

public class Q058 {
	public static void main(String[] args) {
		sum(1, 10);
		sum(11,20);
		sum(21,30);
		sum(31,40);
		sum(41,50);
		sum(51,60);
		sum(61,70);
		sum(71,80);
		sum(81,90);
		sum(91,100);
		
	}

	private static void sum(int startNum, int Endnum) {
		int sum = 0;
		for (int i = startNum; i <= Endnum; i++) {
			sum +=i;
		}
		System.out.printf("%2d ~ %3d: %3d\n",startNum,Endnum,sum);
		
	}
}