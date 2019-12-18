package com.java;

public enum WeekDayEnum {
	
	SUNDAY(0),MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6) ;
	
	private int day;
	WeekDayEnum(int d){
		
		this.day = d;
	}

	public int getDay(){
		
		return day;
	}
	
}
