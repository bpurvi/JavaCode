//WAP to demonstrate the use of this() to call a constructor within the same class.

package java_assignments;
public class AS51ChainingThisCallingstmt
{
	AS51ChainingThisCallingstmt()
	{	this(1.0);
		System.out.println("Non para Constructor 1");
	}
	AS51ChainingThisCallingstmt(String city)
	{	this(382701);
		System.out.println("Constructor 2");
	}
	AS51ChainingThisCallingstmt(int pincode)
	{	
		System.out.println("Constructor 3");
	}
	AS51ChainingThisCallingstmt(double no)
	{	this("Gandhinagar");
		System.out.println("Constructor 1");
	}	
	public static void main(String[] args) 
	{
		new AS51ChainingThisCallingstmt();
	}
}

