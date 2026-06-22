//WAP demonstrating constructor chaining using this().
package java_assignments;
public class A51SuperMostClass 
{
	A51SuperMostClass()
	{
		System.out.println("NonParameterised Constructor 1");
	}
	A51SuperMostClass(String name)
	{	this();
		System.out.println("Parameterised Constructor 2");
	}
}