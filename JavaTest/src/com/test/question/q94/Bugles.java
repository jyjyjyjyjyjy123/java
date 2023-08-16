package com.test.question.q94;

import java.util.Calendar;

public class Bugles {
	private int price;
	private int weight;
	private Calendar creationTime = Calendar.getInstance();
	private int expiration;
	
	String[] date = new String[3];
	
	int year;
	int month;
	int minute;

	//getter, setter 구현

	public int getPrice() {
		return price;
	}

	public int getExpiration() {
		return expiration;
	}

	public void setWeight(int weight) {
		if (weight == 300) {
			this.price = 850;
			this.expiration = 7;
		}else if (weight == 500) {
			this.price = 1200;
			this.expiration = 10;
		}else {
			this.price = 1950;
			this.expiration = 15;
		}
		this.weight = weight;
	}

	public void setCreationTime(String creationTime) {
		date = creationTime.split("-");
		Calendar nowTime = Calendar.getInstance();		
		year = Integer.parseInt(date[0]);
		month = Integer.parseInt(date[1]);
		minute = Integer.parseInt(date[2]);
		this.creationTime.set(year,month-1,minute);
		long nowTick = nowTime.getTimeInMillis();
		long creatTick = this.creationTime.getTimeInMillis();
		long gap = nowTick - creatTick;
		System.out.println();
		expiration-=gap/1000/60/60/24;
		
	}

	public void eat() {
		if (expiration >= 0) {
			System.out.println("과자를 맛잇게 먹습니다.");
		}else {
			System.out.println("유통기한이 지나 먹을 수 없습니다.");
		}
	}
}
