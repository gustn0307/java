package time;

import java.util.Calendar;
import java.util.Date;

public class time {

	public static void main(String[] args) {
		Date date=new Date();
		
		System.out.println(date);
		
		@SuppressWarnings("deprecation")
		Date date2=new Date(1977-1900,1-1,9);
		System.out.println(date2);
		
		Calendar cal=Calendar.getInstance();
		
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
	
	}

}
