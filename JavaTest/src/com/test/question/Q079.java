package com.test.question;

public class Q079 {
	public static void main(String[] args) {
		int[][]	nums= new int[4][4];
		int sum = 1;
		int num1 = 1;
		int num2 = 2;
		for (;;) {
			if (sum > nums.length*nums[0].length) {//칸수만큼의 숫자를 다 쓰게 된경우
				break;
			}
			if (nums[num1][num2] != 0) {//이동한 칸에 중복된 숫자가 있는 경우
				//이전위치의 왼쪽으로 가기 위해서
				num1-=nums.length-1;//배열의 길이-1 만큼 -
				num2+=nums.length-2;//배열의 길이-2 만큼 +
			} else {//이동한 칸에 중복된 숫자가 없는 경우
				nums[num1][num2] = sum;	//해당 칸에 숫자 삽입
				num1--;//열 - 1
				num2++;//행 + 1
				sum++;
			}
			if (num1 < 0) {//위에서 이동한 값이 배열을 벗어났을경우
				num1 += nums.length;//배열의 길이 만큼 +
			}
			if (num2 > nums.length-1) {//이동한 값이 배열을 벗어났을경우
				num2 -= nums.length;//배열의 길이 만큼 -
			}
		}
		
		for(int  i=0;i<nums.length; i++) {
			for (int j=0; j<nums.length; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
	}
}
