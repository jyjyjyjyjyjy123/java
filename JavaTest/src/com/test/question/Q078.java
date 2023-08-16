package com.test.question;

public class Q078 {
	public static void main(String[] args) {
		int[][]	nums= new int[7][7];
		int sum = 1;
		int num1 = 0;
		int num2 = 0;
		int minStack = 0;
		int maxStack = nums.length-1;
		
		for (;;) {
			if (nums[num1][num2] != 0 ) {
				minStack += 1;
				maxStack -= 1;
				num1 += 1;
				num2 += 1;
				if (minStack==maxStack) {
					nums[num1][num2] = sum;
					break;
				}
			}
			if (num1 == minStack && num2 < maxStack) {
				nums[num1][num2] = sum;
				num2++;
				sum++;
			}
			if (num1 < maxStack && num2 == maxStack) {
				nums[num1][num2] = sum;
				num1++;
				sum++;
			}
			if (num1 == maxStack && num2 > minStack ) {
				nums[num1][num2] = sum;
				num2--;
				sum++;
			}
			
			if (num1 > minStack && num2 == minStack ) {
				nums[num1][num2] = sum;
				num1--;
				sum++;
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
