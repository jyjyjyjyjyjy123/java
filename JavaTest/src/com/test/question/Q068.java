package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q068 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = {5,6,1,3,2,8,7,10,9,4};
		int stack = 0;
		System.out.print("삭제 위치: ");
		int place = scan.nextInt();
		System.out.println(Arrays.toString(nums));
		for (int i=place; i<nums.length-1; i++) {
			//nums.length에 -1은 배열을 초과하지 않기위해서
			nums[i] = nums[i+1]; //앞에 뒤의 값을 복사
			stack = i; //마지막자리에 0넣을려고 만들어둔 변수
			//삭제 위치에서부터 뒤의 숫자를 한칸식 땡기기
		}
		nums[stack+1] = 0; //마지막자리에 0 넣기
		System.out.println(Arrays.toString(nums));
	}
}