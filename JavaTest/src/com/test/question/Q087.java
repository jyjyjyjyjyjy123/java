package com.test.question;

import java.util.Scanner;

public class Q087 {//86이랑 바뀜
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자: ");
		String num = scan.nextLine();
		
		String[] nums = num.split("");//입력 받은 숫자 문자열을 배열로 나누기
		String result = "";// 결과를 저장하기 위한 빈 String
		int test = 3;//
		int count = nums.length%3;//입력받은 숫자의 수의 나머지를 저장
		//3자리마다','가 붙지만 4자리의 경우 1,234 5자리의 경우 12,345와 같이
		//앞자리는 한자리 뒤에 혹은 두자리 뒤에도 붙을수 있기때문에 앞자리의 수가 몇자리인지 알기 위해서 사용
		for (int i=0;i<nums.length;i++) {//입력받은 숫자의 수만큼 반복
			if (count == i && i!=0) {//count와 i의 위치가 같을경우
				result += ",";// 해당 숫자 뒤에','추가
				test += i;//다음 ','자리의 위치를 저장
			}
			if ( test == i && i!=0) {//','위치와 i의 위치가 같을경우
				result += ",";
				test += 3;
			}
			result += nums[i];//반복때마다 입력한 수를 차례대로 저장
		}
		System.out.println(result);
	}
}
