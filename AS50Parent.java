/*WAP where the parent class has a parameterized constructor and 
 * the child class calls it using super().
 */
package java_assignments;
public class AS50Parent 
{
	AS50Parent()
	{
		System.out.println("NonParameterised Constructor calling");
	}
	AS50Parent(String name)
	{
		System.out.println("Parameterised Constructor calling");
	}
}
