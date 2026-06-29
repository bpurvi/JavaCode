//WAP to demostrate the StringBuilder methods
package java_assignments;

public class AS102 
{

	 public static void main(String[] args) 
     {
             String a="Java";//String Pool Area-Strings are immutable
                     a.concat("Programing");
                     System.out.println(a);
                     
                     
             StringBuilder s1=new StringBuilder("Playwright");//mutable and Heap memory
             s1.append("TyperScript");
             System.out.println(s1);
             
             StringBuilder s2=new StringBuilder("Cypress");
             s2.append("Typescript");
             System.out.println(s2);
             
             System.out.println(s2.substring(4));
             System.out.println(s2.substring(2, 5));
             System.out.println(s2.charAt(0));
             System.out.println(s2.length());
             System.out.println(s2.capacity());
             System.out.println(s2.replace(1, 7, "Python "));
             System.out.println(s1.insert(10, " Learning "));
             System.out.println(s1.delete(12, 17));
             System.out.println(s2.reverse());
             
             
     }

}
