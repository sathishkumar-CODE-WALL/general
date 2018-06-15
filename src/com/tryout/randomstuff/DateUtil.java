package com.tryout.randomstuff;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat format = new SimpleDateFormat(
			    "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		String date = format.format(new Date());
		System.out.println(date);
	}
}
