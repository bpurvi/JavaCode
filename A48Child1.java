//WAP to demonstrate Hierarchical level inheritance 
package java_assignments;
class parent
{
	static void depositmoney()
	{
		System.out.println("Deposit money");
	}
}
public class A48Child1 extends parent
{	
	void withdrawmoney()
	{
		System.out.println("Withdraw Money");
	}
	public static void main(String[] args) 
	{
		A48Child1 c1 = new A48Child1();
		c1.withdrawmoney();
		depositmoney();
		
	}

}
