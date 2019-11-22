package oop;

import java.util.Calendar;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date currentDate = new Date();
		System.out.println(currentDate);
		Calendar c = Calendar.getInstance();
		c.setTime(currentDate);
		c.add(Calendar.DATE, 98);
		Date nextDate = c.getTime();
		System.out.println(nextDate);
	}

}
