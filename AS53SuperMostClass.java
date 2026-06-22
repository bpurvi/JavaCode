//WAP to Demonstrate the Use of super and this in Constructors Within and Between Classes

package java_assignments;

public class AS53SuperMostClass 
{
	AS53SuperMostClass()
	{	
		System.out.println("NonParameterised Constructor 1");
	}
	AS53SuperMostClass(String name)
	{	this();
		System.out.println("Parameterised Constructor 2");
	}
}