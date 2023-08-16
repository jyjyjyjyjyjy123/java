package com.test.question;

public class Q071 {
	public static void main(String[] args) {
		int[][]	nums= new int[5][5];
		int n = 1;
		for(int  i=nums.length-1;i>=0; i--) {
			for (int j=nums.length-1; j>=0; j--) {
				nums[i][j] = n;
				n++;
			}
		}		
		for(int  i=0;i<nums.length; i++) {
			for (int j=0; j<nums[0].length; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
	}
}
