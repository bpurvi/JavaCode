//WAP to Illustrating the Use of Final Keyword to Prevent Method Overriding
package java_assignments;
class A56Class4 
{
	final void add(int a, int b)	//Use of final keyword to method overriding
	{	
		int sum = a+b;
		System.out.println(sum);
	}
}
class A56Class3 extends A56Class4 
{
	void sub(double a, double b)
	{	
		double sub = a-b;
		System.out.println(sub);
	}
}
class A56Class2 extends A56Class3 
{
	void mul(int a, double b)
	{	
		double mul = a*b;
		System.out.println(mul);
	}
}
public class A56Class1 extends A56Class2 
{
/*	void add(int a, int b)
	{	
		int sum = a+b;
		System.out.println("Sum is: "+sum);
		super.add(30, 40);	//parent class1 method
	}*/
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
		A56Class1 a1 = new A56Class1();
		a1.add(10, 20);
		a1.sub(40.0, 11.0);
		a1.mul(10, 30.1);
	}
}


