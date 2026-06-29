//WAP to print future data and past date with different formats.
package java_assignments;

import java.util.Date;

public class AS98 {

	public static void main(String[] args) 
	{
		Date d1 = new Date();
		System.out.println("Today's date is: "+d1.getTime());
		
		Date d2 = new Date(d1.getTime());
		System.out.println("Today's date is: "+d2);
		//past time
		Date d3 =new Date(d1.getTime()-1000*60*60*24*3l);
		System.out.println("Past date is: "+d3);
		String s1 = d3.toString();
		
		String date1 = s1.substring(8, 10);
		System.out.println("date is: "+date1);
		
		String month1 = s1.substring(4, 7);
		System.out.println("month is: "+month1);
		
		String year1 = s1.substring(s1.length()-4);
		System.out.println("year is: "+year1);
		
		String format1 = date1+month1+year1;
		System.out.println("Format 1 of Past Time is: "+format1);
		
		String format2 = date1.concat("-").concat(month1).concat("-").concat(year1);
		System.out.println("Format 2 of Past Time is: "+format2);
		
		String format3 = date1.concat("/").concat(month1).concat("/").concat(year1);
		System.out.println("Format 3 of Past Time is: "+format3);
		
		//future time
		Date d4 =new Date(d1.getTime()+1000*60*60*24*3l);
		System.out.println("Future date is: "+d4);
		String s2 = d4.toString();
		
		String date2 = s2.substring(8, 10);
		System.out.println("date is: "+date2);
		
		String month2 = s2.substring(4, 7);
		System.out.println("month is: "+month2);
		
		String year2 = s2.substring(s2.length()-4);
		System.out.println("year is: "+year2);
		
		String hour2 = s2.substring(11, 13);
		System.out.println("hour is: "+hour2);
		
		String min2 = s2.substring(14, 16);
		System.out.println("min is: "+min2);
		
		String sec2 = s2.substring(17, 19);
		System.out.println("month is: "+sec2);
		
		String format5 = date2+month2+year2;
		System.out.println("Format 1 of Future Time is: "+format5);
		
		String format6 = date2.concat(month2).concat(year2).concat(hour2).concat("H:").concat(min2).concat("M:").concat(sec2);
		System.out.println("Format 2 of Future Time is: "+format6);
		
		
		
	}

}
