/*WAP to Demonstrate Multilevel Inheritance Using Concrete and Abstract Classes
⁠1. ConcreteClass → 2 concrete methods
2. AbstractClass → 1 concrete method + 1 abstract method
3. DerivedClass → Implements the abstract method 
 */
package java_assignments;
//Concrete class
class ClassB
{
	static void method1()
	{
		System.out.println("Concrete MEthod 1");
	}
	static void method2()
	{
		System.out.println("Concrete MEthod 2");
	}
}
//abstract class
abstract class ClassA
{
	abstract void method3();	//abstract method
	static void method4()
	{
		System.out.println("Concrete Method - This logic will be exposed");
	}
}
public class AS68DerivedClass {

	public static void main(String[] args) 
	{
		
	}
	void method3()
	{
		System.out.println("This logic would be exposed");
	}


}
