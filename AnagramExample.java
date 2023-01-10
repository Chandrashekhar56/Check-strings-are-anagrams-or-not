import java.util.*;
class AnagramExample{
    public static void main(String[] args) {
       String s="abc";
       String c="cba";
       int len=s.length();
       char []ss=new char[len];
       char []cc=new char[len];
       if(s.length() == c.length())
       {
           for(int i=0;i<s.length();i++)
           {
               // Here we will convert string into char array
               ss[i]=s.charAt(i);
               cc[i]=c.charAt(i);
           }
           // Here we will sort both char array
           Arrays.sort(ss);
           Arrays.sort(cc);
          
           // Here we will check whether both char the arrays are equal or not.
           boolean result=Arrays.equals(ss,cc);
           if(result)
           {
               System.out.println("this is anagram");
           }
           else
           {
               System.out.println("This is not anagram");
           }
       }
       else
       {
           System.out.println("not anagram");
       }
    }
}
