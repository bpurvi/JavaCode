// Assignment 44: WAP to demonstrate multilevel-level inheritance.
package java_assignments;

public class AS44_Class1 extends AS44_Class2	//SubClass extends Super Class
{
	void settletoforeign()
	{
		System.out.println("Foreign Country Viza");
	}
	
	public static void main(String[] args) 
	{
		AS44_Class1 a1 = new AS44_Class1();
		a1.havingland();
		a1.havingcar();
		a1.havinghouse();
		a1.settletoforeign();
	}

}
