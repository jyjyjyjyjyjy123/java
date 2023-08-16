package com.test.question;

public class Q084 {
	public static void main(String[] args) {
		String content = "안녕~ 길동아~ 잘가~ 길동아~길동";//검사하고자 하는 문자열
		int index = -1;//
		int sum = 0;//발견횟수 저장용 변수
		while (true) {
			index = content.indexOf("길동", index);
			//"길동"을 index의 위치에서 부터 시작하여 탐색
			//찾을시 인덱스에 해당 위치를 저장
			//못찾을시 -1을 저장
			if (index == -1) {
				break;
			}
			sum += 1;//발견횟수 증가
			index += 2;//길동을 탐색할때 시작하는 위치를 바꾸기위한 값 변화
		}
		System.out.printf("'길동'을 총 %d회 발견했습니다",sum);
		
	}
}
