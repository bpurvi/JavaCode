//WAP to Demonstrate Abstraction Using Interface and Abstract Class
package java_assignments;
interface i1
{
	void addition();
}
interface i2 extends i1
{
	void subtraction();
}
public class AS71 implements i2 
{

	public static void main(String[] args) 
	{
		AS71 a1 = new AS71();
		a1.addition();
		a1.subtraction();

	}
	@Override
	public void addition() {
		System.out.println("Addition");		
	}

	@Override
	public void subtraction() {
		System.out.println("Subtraction");
		
	}
	

}
