package com.test.question;

public class Q075 {
	public static void main(String[] args) {
		int[][]	nums= new int[7][7];
		int n = 1;
		for(int  i=0;i<nums.length-1; i++) {//회색부분만 나오도록
			for (int j=0; j<nums.length-1; j++) { //회색부분만 나오도록
				nums[i][j] = n;
				nums[i][nums.length-1] += n; //행 마지막 부분에 값 누적
				nums[nums.length-1][j] += n; //열 마지막 부분에 값 누적
				n++;		
			}
			nums[nums.length-1][nums.length-1] += nums[i][nums.length-1];
			//전체합 누적
		}
		
		for(int  i=0;i<nums.length; i++) {
			for (int j=0; j<nums.length; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
	}
}
