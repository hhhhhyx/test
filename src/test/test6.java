package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test6 {
	public static void main(String[] args) throws ParseException{
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");

		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date date=new Date();

		String dateStr=sdf1.format(date);
		date=sdf.parse(dateStr);
		java.sql.Date time=new java.sql.Date(date.getTime());
		
		System.out.println(dateStr);
		
	}
}
