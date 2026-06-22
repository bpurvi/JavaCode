//WAP to Illustrating Use of Super Keyword in Method Overriding
package java_assignments;
class A55Class4 
{
	void add(int a, int b)
	{	
		int sum = a+b;
		System.out.println(sum);
	}
}
class A55Class3 extends A55Class4 
{
	void sub(double a, double b)
	{	
		double sub = a-b;
		System.out.println(sub);
	}
}
class A55Class2 extends A55Class3 
{
	void mul(int a, double b)
	{	
		double mul = a*b;
		System.out.println(mul);
	}
}
public class A55Class1 extends A55Class2 
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
		A55Class1 a1 = new A55Class1();
		a1.add(10, 20);
		a1.sub(40.0, 11.0);
		a1.mul(10, 30.1);
	}
}


