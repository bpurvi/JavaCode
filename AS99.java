//WAP on string methods split (),isblank,()is empty()
package java_assignments;

import java.util.Arrays;

public class AS99 
{
	public static void main(String[] args) 
	{
		String a = "I-Am-an-Engineer";
		String [] s1 = a.split("-");
		System.out.println(Arrays.toString(s1));
		
		String b = " ";
		boolean b1 = b.isEmpty();
		System.out.println(b1);
		boolean b2 = b.isBlank();
		System.out.println(b2);

	}

}
