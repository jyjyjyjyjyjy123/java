package com.test.question;

import java.util.Arrays;

public class Q066 {
	public static void main(String[] args) {
		int[] randomNums = new int[6];
		for (int i=0; i<randomNums.length; i++) {
			randomNums[i] = (int)((Math.random()*45)+1);//랜덤난수 생성
			for (int j=0; j<i; j++) {//중복값을 비교 하기 위한 반복문
				if (randomNums[j]==randomNums[i]) {
					//새로 생성한 값과 기존의 값이 중복이 될경우
					i--; //for문의 i++을 상쇄 하여 중복자리를 다시 실행
					continue;
				}
			}
		}
		Arrays.sort(randomNums);//오름차순
		System.out.println(Arrays.toString(randomNums));
	}
}