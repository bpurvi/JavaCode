//WAP on string function matches(), replace(char a, char b), replace(charSeq a, charSeq b) and replaceAll(string regx, string)
package java_assignments;
public class AS83 
{
	public static void main(String[] args) 
	{
		String address = "ABC, 62, City:Ahmedabad, Gujarat";
		boolean b1 = address.matches("(.*)City(.*)");
		System.out.println("String matches?: "+b1);
		
		String b2 = address.replace('C', 'D');
		System.out.println("Replcing character: "+b2);
		
		String b3 = address.replace("City:Ahmedabad", "City:Vadodara");
		System.out.println("Replcing charSeq: "+b3);
		
		String b4 = address.replaceAll("[A-Z]", "X");	
		System.out.println("Replcing All: "+b4);
	
	}

}
