//WAP to to Demonstrate Iterator and Its Methods in ArrayList
package java_assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class AS106 
{
	public static void main(String[] args) 
	{
		ArrayList<Character> c1 = new ArrayList<Character>();
		c1.add('Z');
		c1.add('Y');
		c1.add('X');
		System.out.println(c1);
		
		Iterator<Character> etr = c1.iterator();
		while(etr.hasNext())
		{
			System.out.println(etr.next());
		}
	}

}
