//WAP to access Public, protected, default & private variables outside the package by becoming sub class

package java_assignments;

import just.practice.AS59Parent;

public class AS59Child extends AS59Parent
{
	public static void main(String[] args)
	{
		System.out.println(AS59Parent.rollno);
		System.out.println(AS59Parent.name);
	
	}
}
