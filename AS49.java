//WAP to demonstrate the use of super() to call a parent class constructor.
package java_assignments;
class V3
{
        V3(int a,int b)
        {
            System.out.println("Constructor 3");
        }
}
class V2 extends V3
{
        V2()
        {
             super(10,20);
             System.out.println("Constructor 2");
        }
}
public class AS49 extends V2
{
		AS49()
        {
             System.out.println("Constructor 1");
        }
        public static void main(String[] args) 
        {
             new AS49();
        
        }
}
