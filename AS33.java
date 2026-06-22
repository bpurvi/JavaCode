//WAP to Illustrate Switch Case Statement Using Scanner Class
package java_assignments;
import java.util.Scanner;
public class AS33 
{
	public static void main(String[] args) 
	{
	    Scanner s1=new Scanner(System.in);
	    System.out.println("Click on withdraw money");
	    System.out.println("Click on deposit your money ");
	    System.out.println("Click on Mini Statement");
	    System.out.println("Click on Mobile number update");
	    System.out.println("Click on Language Selection");
	
	    int atmOption = s1.nextInt();
	    switch(atmOption)
	    {
	    case 1: 
	    System.out.println("Withdrar your money");
	    break;
	    case 2:
	    System.out.println("Deposit your money");
	    break;
	    case 3:
	    System.out.println("Check your Mini Statement");
	    break;
	    case 4:
	    System.out.println("Update your Mobile number");
	    break;  
	    case 5: 
	    System.out.println("Select the Laguage");
	    break;
	    default:        
	    System.out.println("your selection is wrong");
	            
	    s1.close();
	    }
	}
}
