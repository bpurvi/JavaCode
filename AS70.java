//WAP to Show Relationship Between Two Interfaces
package java_assignments;
interface a1
{
	void login();
}
interface a2 extends a1
{
	void logout();
}
public class AS70 implements a2 
{

	public static void main(String[] args) 
	{
		AS70 a1 = new AS70();
		a1.login();
		a1.logout();

	}
	@Override
	public void login() 
	{
		System.out.println("Login logic exposed");
	}

	@Override
	public void logout() 
	{
		System.out.println("Logout logic exposed");
		
	}

}
