//WAP to check the given string palidrome or not
package java_assignments;

public class AS82PalidromeString {

	public static void main(String[] args) 
	{
		String input= "Pop";
		String reverse = "";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1 = input.charAt(i);
			reverse = reverse + c1;
		}
		System.out.println("Reverse String is: "+reverse);
		boolean b1 = input.equals(reverse);
		System.out.println("Chcek with equal(): "+b1);
		boolean b2 = input.equalsIgnoreCase(reverse);
		System.out.println("Check with equalIngnoreCase(): "+b2);		
	}

}
