//WAP to Illustrating Use of Super Keyword in Method Overriding
package java_assignments;
class A54Class4 
{
	void add(int a, int b)
	{	
		int sum = a+b;
		System.out.println(sum);
	}
}
class A54Class3 extends A54Class4 
{
	void sub(double a, double b)
	{	
		double sub = a-b;
		System.out.println(sub);
	}
}
class A54Class2 extends A54Class3 
{
	void mul(int a, double b)
	{	
		double mul = a*b;
		System.out.println(mul);
	}
}
public class A54Class1 extends A54Class2 
{
	void add(int a, int b)
	{	
		int sum = a+b;
		System.out.println("Sum is: "+sum);
		super.add(30, 40);	//parent class1 method
	}
	void sub(double a, double b)
	{	
		double sub = a-b;
		System.out.println("Sub is: "+sub);
		super.sub(30.0, 11.0);
	}
	
	void mul(int a, double b)
	{	
		super.mul(22, 11.1);
		double mul = a*b;
		System.out.println("Mul is: "+mul);
		
	}
	public static void main(String[] args)
	{
		A54Class1 a1 = new A54Class1();
		a1.add(10, 20);
		a1.sub(40.0, 11.0);
		a1.mul(10, 30.1);
	}
}


