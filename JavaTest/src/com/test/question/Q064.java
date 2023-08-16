package com.test.question;

import java.util.Arrays;

public class Q064 {
	public static void main(String[] args) {
		int[] randomNums = new int[20];
		int maxNum = 0;
		int minNum = 100;
		for (int i=0; i<randomNums.length; i++) {
			randomNums[i] = (int)((Math.random()*20)+1);
		}
		for (int j=0; j<randomNums.length; j++) {
			if (maxNum < randomNums[j]) {
				maxNum = randomNums[j];
			}
			if (minNum > randomNums[j]) {
				minNum = randomNums[j];
			}
		}
		System.out.printf("원본: %s\n", Arrays.toString(randomNums));
		System.out.printf("최댓값: %d\n",maxNum);
		System.out.printf("최댓값: %d\n",minNum);
	}
}