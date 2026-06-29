//WAP to Demonstrate size(), get() and contains() Methods of ArrayList
package java_assignments;
import java.util.ArrayList;
public class AS105 
{
	  public static void main(String[] args) 
      {         
              ArrayList<String> a1=new ArrayList<String>();
              a1.add("Ram");
              a1.add("Alisha");
              a1.add("Naina");
              a1.add("Bheem");
              a1.add("Vishu");
              System.out.println(a1);
              System.out.println(a1.contains("Purvi"));
              System.out.println(a1.contains("Ram"));
             
              for(int i=0;i<a1.size();i++)
              {
	              String s1= a1.get(i);
	              System.out.println(s1);
              }
      }
}
