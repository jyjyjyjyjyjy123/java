package com.test.question;

public class Q077 {
	public static void main(String[] args) {
		int[][]	nums= new int[5][5];
		int n = 1;
		for(int  i=0; i<nums.length+nums.length-1; i++) {
			//(열+행)-1 회만큼 반복하도록 설정
			if (i<nums.length) {
				for (int j=0; j<=i; j++) {
					nums[j][i-j] = n;//대각선으로 이동 하도록 설정
					//대각선의 칸들은 열과 행의 위치값을 더하면 같다.
					n++;		
				} 
			} else {//행 이 배열의 끝까지 갔을 경우
				for (int j=nums.length-1; j>i-nums.length; j--) {
					//위의 for문에서 행이 배열의 끝까지 갔기 때문에 거기서부터 시작해서
					//위의 for문에서 
					nums[i-j][j] = n;//대각선으로 이동 하도록 설정
					n++;		
				} 
			}
				
		}
		
		
		
		//출력
		for(int  i=0;i<nums.length; i++) {
			for (int j=0; j<nums[0].length; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
	}
}
