//WAP to find out the current time,past time and future time.
package java_assignments;
import java.util.Date;
public class AS97 {
	public static void main(String[] args)
	{
		Date d1 = new Date();
		System.out.println("Today's date is: "+d1.getTime());
		
		Date d2 = new Date(d1.getTime());
		System.out.println("Today's date is: "+d2);
		
		Date d3 =new Date(d1.getTime()-1000*60*60*24*3l);
		System.out.println("Past date is: "+d3);
		
		Date d4 =new Date(d1.getTime()+1000*60*60*24*3l);
		System.out.println("Future date is: "+d4);
	}
}
