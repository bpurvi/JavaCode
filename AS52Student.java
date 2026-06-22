//WAP to demonstrate the use of this() to call a constructor within the same class.
package java_assignments;
public class AS52Student
{
	AS52Student()
	{	this(1);
		System.out.println("Default Constructor");
	}
	AS52Student(int a)
	{
		System.out.println("Parameterised Constructor");

	}
	public static void main(String[] args) 
	{
		new AS52Student();
	}

}