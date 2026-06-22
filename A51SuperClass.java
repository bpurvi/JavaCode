//WAP demonstrating constructor chaining using this().
package java_assignments;
public class A51SuperClass extends A51SuperMostClass
{
	A51SuperClass()
	{
		this("Purvi");
		System.out.println("NonParameterised Constructor 3");
	}
	A51SuperClass(String name)
	{
		System.out.println("Parameterised Constructor 4");
	}
}
