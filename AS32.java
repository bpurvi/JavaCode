//WAP to Calculate the Circumference of a Circle and triange using scanner class
package java_assignments;

import java.util.Scanner;

public class AS32 
{
	 public static void main(String[] args) 
     {
             Scanner s1=new Scanner(System.in);
             System.out.println("Please enter the value of R:");
             double r= s1.nextDouble();
             double circumferance=2*Math.PI*r;
             System.out.println("CIrcumferace of Circle is: "+ circumferance);
             
             System.out.println("Please enter value of side a:");
             double a1 = s1.nextDouble();
             System.out.println("Please enter value of side b:");
             double b1 = s1.nextDouble();
             System.out.println("Please enter value of side c:"); 
             double c1 = s1.nextDouble();
             
             double sum = a1+b1+c1;
             System.out.println("Perimeter of Traingle is:" + sum);
          
             s1.close();
             
             
     }
}
