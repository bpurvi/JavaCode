/*WAP using for loop to print the output as :
Todays date is: 10
Month is: March
Year is: 2026
Hour is: 20
Min is: 53
Sec is" 46

To print the above mentioned output use input string as :
String input="10 March 2026 20 53 46";
*/
package java_assignments;
import java.util.Arrays;
public class AS100 
{
	public static void main(String[] args) 
	{
		String d="10 March 2026 20 53 46";
        String [] dateformat=d.split(" ");
        System.out.println(Arrays.toString(dateformat));
        
        String labels[] = {
        	    "Todays date is: ",
        	    "Month is: ",
        	    "Year is: ",
        	    "Hour is: ",
        	    "Min is: ",
        	    "Sec is: "
        	};
        for(int i=0;i<dateformat.length;i++)
        {
        	System.out.println(labels[i] + dateformat[i]);
        }
      }

}
