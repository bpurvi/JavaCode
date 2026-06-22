//WAP For demonstrating multiple-level inheritance using 4 parent interfaces.
package java_assignments;
interface I1
{
	void login();
}
interface I2
{
	void searchingproduct();
}
interface I3
{
	void addtocart();
}
interface I4
{
	void logout();
}
public class AS72 implements I1, I2, I3, I4 {

	public static void main(String[] args) 
	{
		
		AS72 a1 = new AS72();
		a1.login();
		a1.searchingproduct();
		a1.addtocart();
		a1.logout();
	}

	@Override
	public void login() 
	{
		System.out.println("Login to application");
		
	}

	@Override
	public void addtocart() 
	{
		System.out.println("Product added to Cart");
		
	}

	@Override
	public void searchingproduct() 
	{
		System.out.println("Search product");		
	}

	@Override
	public void logout() 
	{
		System.out.println("Logout from application");
	}

}
