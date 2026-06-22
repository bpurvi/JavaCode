	//WAP to demonstrate the use of an interface.
	package java_assignments;
	interface A1
	{
	        void Addition();
	        void Subtrtaction();
	}
	interface A2
	{
	        void Multiplication();
	        void Dvision();
	}
	public class AS69MultipleLevelInheritance implements A1, A2
	{
		public static void main(String[] args) 
		{
			
	
		}
		@Override
		public void Dvision() {
			// TODO Auto-generated method stub
			
		}
		public void Addition()
		{
			System.out.println("Add..");
		}
		public void Subtrtaction()
		{
			System.out.println("Sub..");
		}
		public void Multiplication()
		{
			System.out.println("Mul..");
		}
	}
