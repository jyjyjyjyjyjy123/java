package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q067 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = {5,6,1,3,2,8,7,4,10,9};
		System.out.print("삽입 위치: ");
		int place = scan.nextInt();
		System.out.print("값: ");
		int inputNum = scan.nextInt();
		System.out.println(Arrays.toString(nums));
		if (nums[place] != 0) {//만약 삽입위치에 숫자가 존재할 경우 실행
			for (int i=nums.length-1; i>place; i--) {
				nums[i] = nums[i-1];//앞의 값을 뒤에 복사
				//제일뒤에서부터 앞의 숫자를 한칸씩 땡기기
			}
		}
		nums[place] = inputNum;//지정한 삽입위치에 값 추가
		System.out.println(Arrays.toString(nums));
	}
}