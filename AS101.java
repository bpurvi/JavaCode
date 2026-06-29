//WAP to demostrate the StringBuffer methods
package java_assignments;

public class AS101 
{

	 public static void main(String[] args) 
     {
             String a="Java";//String Pool Area-Strings are immutable
                     a.concat("Programing");
                     System.out.println(a);
                     
                     
             StringBuffer s1=new StringBuffer("Playwright");//mutable and Heap memory
             s1.append("TyperScript");
             System.out.println(s1);
             
             StringBuilder s2=new StringBuilder("Cypress");
             s2.append("Typescript");
             System.out.println(s2);
             
             System.out.println(s2.replace(1, 7, "Python "));
             System.out.println(s1.insert(10, " Learning "));
             System.out.println(s1.delete(12, 17));
             System.out.println(s2.reverse());
             
             
     }

}
