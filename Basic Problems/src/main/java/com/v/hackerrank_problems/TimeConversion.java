package com.v.hackerrank_problems;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

	public static void main(String[] args) throws ParseException {
		String time="07:05:45PM";
		System.out.println(convert(time));
	}

	private static String convert(String time){
		// TODO Auto-generated method stub

		SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ssa");
        SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = null;
		try {
			date = inputFormat.parse(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String convert=outputFormat.format(date);
        return convert;

	}

}
