//WAP to Demonstrate Abstract Class and Concrete Class
package java_assignments;
abstract class ab	//abstract class
{
	abstract void login();	//abstract method
	
	static void logout()	//concrete method
	{
		System.out.println("CONCRETE METHOD");
	}
	
}

public class AS65 extends ab
{
	void login()	//Concrecte MEthod
	{
		System.out.println("Concrete Method");
	}
	public static void main(String[] args) 
	{
		
		AS65 a1 = new AS65();
		a1.login();
		a1.logout();
	}

}
