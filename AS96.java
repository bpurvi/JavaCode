//WAP to Check in the given String how many are special char present
package java_assignments;
public class AS96
{
        static int countOfALpha=0;
        static int countOfNumeric=0;
        static int countOfSpace=0;
        static int counOfSpecialChar=0;

        public static void main(String[] args) 
        {
                String input="kV NO 12 !@#";
                char [] c1=        input.toCharArray();
                
                for(int i=0;i<input.length();i++) 
                {
                        boolean b1=        Character.isAlphabetic(c1[i]);
                                if(b1)
                                {
                                        countOfALpha++;
                                }
                        boolean b2=        Character.isDigit(c1[i]);
                                if(b2)
                                {
                                        countOfNumeric++;
                                }
                        boolean b3=        Character.isWhitespace(c1[i]);
                                if(b3)
                                {
                                        countOfSpace++;
                                }
                                
                                
                }
        System.out.println("Length of the given String-> "+input.length());
        System.out.println("Count of Total alphabets-> "+countOfALpha);
        System.out.println("Count of Total Numeric-> "+countOfNumeric);
        System.out.println("Count of Total SPace-> "+countOfSpace);

         counOfSpecialChar=input.length()-(countOfALpha+countOfNumeric+countOfSpace);
        
        System.out.println("Count of Total Special char-> "+counOfSpecialChar);

        }
}

