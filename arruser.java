import java.util.*;
public class arruser
 {
    public static void main(String[] args)
    {
        Scanner s = new  Scanner(System.in);
        int arr[] =new int[5];
        for(int i=0;i<arr.length;i++)
        {   
            System.out.println("Enter array elements:");
            arr[i]=s.nextInt();
        }
       System.out.println("The array elements are:");     
       for(int j=0;j<arr.length;j++)
       {
        System.out.println(arr[j]);
       }    
    
    }

    
}
