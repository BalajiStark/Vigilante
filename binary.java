
import java.util.*;
public class binary
{
    public static void main(String args[])
    {
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     int n1=1,j=0;
     int a[]=new int[n];
     for(int i=0;i<n;i++)
       {
         n1=n1*2;
         a[i]=0;
       }
        for(int i=0;i<n;i++)
        {
            System.out.print("0");
        }
        System.out.print(",");
        
     for(int i=1;i<n1;i++)
     {
        int sum=i;
        j=0;
        while(sum!=0)
        {
            int r=sum%2;
            a[j]=r;
            sum=sum/2;
            j++;
        }
        for(j=n-1;j>=0;j--)
        {
            System.out.print(a[j]);
        }
       
        if(i!=n)
         System.out.print(",");
      
     }
     
        
        
}
    }

