//WAP to demonstrate multilevel-level inheritance with non static method  
package java_assignments;
class Supermost
{
	void land()
	{
		System.out.println("Owns Land");
	}
}
class Parent extends Supermost
{
	void house()
	{
		System.out.println("Owns house");
	}
}
public class AS47Child extends Parent
{
	void  car()
	{
		System.out.println("Oens Car");
	}
	public static void main(String[] args) 
	{
		AS47Child c1 = new AS47Child();
		c1.land();
		c1.house();
		c1.car();
	}

}
