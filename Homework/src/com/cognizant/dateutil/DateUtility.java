package com.cognizant.dateutil;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateUtility {
	public static void main(String args[]) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("M-dd-yyyy H:m:s");
		
		// Tue Nov 04 20:14:11 EST 2003
		Date date = sdf.parse("11-04-2003 20:14:11");
		System.out.println(date);
		
		// 11/4/03 8:14 PM
		sdf=new SimpleDateFormat("M/d/yy h:m a");
		System.out.println(sdf.format(date));
		
		// 8:14:11 PM
		sdf=new SimpleDateFormat("h:m:s a");
		System.out.println(sdf.format(date));
		
		// Nov 4, 2003 8:14:11 PM
		sdf=new SimpleDateFormat("MMM d, yyyy h:m:s a");
		System.out.println(sdf.format(date));
		
		 // 8:14 PM
		sdf=new SimpleDateFormat("h:m a");
		System.out.println(sdf.format(date));
		
		 // 8:14:11 PM
		sdf=new SimpleDateFormat("h:m:s a");
		System.out.println(sdf.format(date));
		
		// 8:14:11 PM EST
		sdf=new SimpleDateFormat("h:m:s a z");
		System.out.println(sdf.format(date));
		
		// 11/4/03 8:14 PM
		sdf=new SimpleDateFormat("MM/d/yy h:m a");
		System.out.println(sdf.format(date));
		
		// Nov 4, 2003 8:14 PM
		sdf=new SimpleDateFormat("MMM d, yyyy h:m a");
		System.out.println(sdf.format(date));
		
		// November 4, 2003 8:14:11 PM EST
		sdf=new SimpleDateFormat("MMMM d, yyyy h:m:s a z");
		System.out.println(sdf.format(date));
	}
}
