//WAP to Demonstrate the Use of super and this in Constructors Within and Between Classes
package java_assignments;
public class AS53SuperClass extends AS53SuperMostClass
{
	AS53SuperClass()
	{
		this("Purvi");
		System.out.println("NonParameterised Constructor 3");
	}
	AS53SuperClass(String name)
	{	super("Babariya");
		System.out.println("Parameterised Constructor 4");
	}
}