//WAP to Illustrate Abstract Method and Method Overriding
package java_assignments;
abstract class Class3         //abstarct class
	{
	  abstract void method2(); //abstarct method
	  static void method1()    //concrete method
	    {
	           System.out.println("This logic will be exposed 1");
	    }
	}
abstract class Class2 extends Class3   //abstarct class
	{
	   abstract void method3();//abstarct method
	   abstract void method4();//abstarct method
	                
	    //1 concrete method
	   static void method5()//concrete method
	    {
	       System.out.println("This logic will be exposed 2");
	    }
	}
public class AS66ChildClass extends Class2     //concrete class
	{
	  public static void main(String[] args) //concrete method
	  {
	                
	  }

	  void method3() 
	  {
	     System.out.println("This logic will not be exposed");
	   }

	    void method4() 
	    {
	      System.out.println("This logic will not be exposed");

	    }

	     void method2() 
	     {
	       System.out.println("This logic will not be exposed");

	     }
	}

