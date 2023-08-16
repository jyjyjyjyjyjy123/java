package com.test.question.q99;

import java.util.Calendar;

public class Time {
	private Calendar time = Calendar.getInstance();;
	private int hour=0;
	private int minute=0;
	private int second=0;
	
	
	public Time() {
		this(0,0,0);
	}
	public Time(int hour, int minute, int second) {		
		if(second >= 60) {
			minute += second/60;
			this.second += second%60;
		}else {
			this.second += second;
		}
		if(minute >= 60) {
			this.hour += minute/60;
			this.minute += minute%60;
		}else {
			this.minute += minute;
		}
		this.hour += hour;
		
		this.time.set(Calendar.HOUR_OF_DAY, this.hour);
		this.time.set(Calendar.MINUTE, this.minute);
		this.time.set(Calendar.SECOND, this.second);
		
		
	}
	public Time(int minute, int second) {
		this(0,minute,second);
	}
	public Time(int second) {
		this(0,0,second);
	}
	public String info() {
		return String.format("%tT",this.time);
	}
	
}
