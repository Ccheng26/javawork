package test.java.project;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;

public class TestClassCalendar {
	public static void main(String args[]) throws ParseException{
		//formats current date into M/dd/yyyy
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy H:m:s");
		String date = sdf.format(new Date());
		System.out.println(date);
		System.out.println("-------------------------------------");
		sdf=new SimpleDateFormat("dd-M-yyyy h:m:s");
		String dateInString = "31-08-1982 10:20:56";
		Date dateObj= sdf.parse(dateInString);
		System.out.println(dateObj);
		System.out.println("-------------------------------------");
		Calendar calendar= Calendar.getInstance();
		dateObj= calendar.getTime();
		System.out.println(dateObj);
	}
}
