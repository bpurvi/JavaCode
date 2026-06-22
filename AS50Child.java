/*WAP where the parent class has a parameterized constructor and 
 * the child class calls it using super().
 */
package java_assignments;
public class AS50Child extends AS50Parent
{
	AS50Child()
	{
		super("Parent class Constructor calling");
		System.out.println("Calling constructor of Child class");
	}

	public static void main(String[] args) 
	{
		new AS50Child();

	}

}
