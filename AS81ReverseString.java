//WAP on string functions subString(index), subString(index, endIndex), reverse()
package java_assignments;

public class AS81ReverseString
{
	public static void main(String[] args) 
	{
		String s1= "Manual";
		System.out.println("Substring indexing 1 is "+ s1.substring(4));
		System.out.println("Substring indexing 2 is "+ s1.substring(1, 3));
		String reverse = "";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char c1 = s1.charAt(i);
			reverse = reverse + c1;
		}
		System.out.println("Reverse String is: "+reverse);
	}

}
