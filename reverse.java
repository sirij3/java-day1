import java.util.*;
class Reverse
{
    public static void main(String[] args)
    {
      Scanner s= new Scanner(System.in);
      System.out.println("enter a string:");
      String str= s.nextLine();
      String reversed="";
      for(int i=str.length()-1;i>0;i--)
      {
        reversed=reversed+str.charAt(i);
      }                                    
     System.out.println("reversed string:"+reversed);
    }
}    

