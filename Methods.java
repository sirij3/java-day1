import java.util.*;
public class Methods
 {
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=s.nextLine();
        System.out.println("length:"+str.length());
        System.out.println("trim:"+str.trim());
        System.out.println("uppercase:"+str.toUpperCase());
        System.out.println("lowercase:"+str.toLowerCase());
        System.out.println("equals:"+str.equals("mango"));
        System.out.println("ignore case:"+str.equalsIgnoreCase("java"));

    }
 }