//WAP to Calculate the perimeter of triangle using scanner class
package java_assignments;

import java.util.Scanner;

public class AS41 
{
	 public static void main(String[] args) 
     {
             Scanner s1=new Scanner(System.in);
             System.out.println("Let's calculate the value of perimeter of Tringle");
             
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
