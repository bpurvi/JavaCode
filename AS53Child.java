//WAP to Demonstrate the Use of super and this in Constructors Within and Between Classes
package java_assignments;
public class AS53Child extends AS53SuperClass
{
	AS53Child()
	{	super("Child Constructor");
		System.out.println("Calling constructor 5");
	}

	public static void main(String[] args) 
	{
		new AS53Child();

	}

}