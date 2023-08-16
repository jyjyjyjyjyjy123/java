package com.test.question;

public class Q042 {
	public static void main(String[] args) {
		String leapYear = "";
		int sum = 0;
		for (int i = 1; i <= 2022; i++) {
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				leapYear = "윤년";
			} else {
				leapYear = "평년";
			}
			if (leapYear == "윤년") {
				sum += 366;
			} else {
				sum += 365;
			}
		}
		sum += 24;
		for (int i = 1;i <= 6;i++) {
			switch (i) {
			case 1:	case 3:	case 5:	case 7:	case 8:	case 10: case 12:
				sum += 31;
				continue;
			case 2:
				sum += 28;
				continue;
			case 4: case 6: case 9: case 11:
				sum += 30;
				continue;
			}
		}
		String day = "";
		switch (sum % 7) {
		case 0:
			day = "일요일";
			break;
		case 1:
			day = "월요일";
			break;
		case 2:
			day = "화요일";
			break;
		case 3:
			day = "수요일";
			break;
		case 4:
			day = "목요일";
			break;
		case 5:
			day = "금요일";
			break;
		case 6:
			day = "토요일";
			break;
		}
		System.out.printf("2023년 7월 24일은 %,d일째 되는 날이고 %s입니다.", sum, day);
	}
}
