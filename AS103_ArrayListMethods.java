//WAP to call ArrayList methods
package java_assignments;

import java.util.ArrayList;

public class AS103_ArrayListMethods 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add("Abc");
		a1.add(11);
		a1.add("Bcd");
		a1.add(12);
		a1.add("Cde");
		a1.add(13);
		a1.add("Def");
		a1.add(14);
		a1.add('E');
		a1.add(true);
		a1.add(44.44);
		a1.add(400);
		
		ArrayList a2 = new ArrayList();
		a2.add(100);
		a2.add(200);
		a2.add(300);
		a2.add(400);
		a2.add(500);
		a2.add(600);
		a2.add("Array 2");
		a2.add(3, "Me");
		System.out.println("Array2 is:"+a2);
		a2.addAll(a1);
		System.out.println(a2);
		
		System.out.println("Array1 is: "+a1);
		a1.remove(0);
		System.out.println("Array1 is: "+a1);
		a1.remove("Abc");
		a1.removeAll(a1);
		System.out.println("Array1 is: "+a1);
		System.out.println("Array 1 contains value 13? : "+a1.contains(13));
		a1.clear();
		System.out.println("Is it an empty Array?: "+a1.isEmpty());
		boolean b1 = a1.equals(a2);
		System.out.println("Is both arrays are equal?: "+b1);
		
		
		
		
	}

}
