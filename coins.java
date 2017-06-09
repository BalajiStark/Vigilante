import java.util.*;
public class coins {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int count=0,j=1,k=0;
        System.out.println("Enter total amount");
       int sum=in.nextInt();
        System.out.println("Enter the N types of coins");
       int n=in.nextInt();
        System.out.println("Enter the values of coins in ascending order");
       int[] a=new int[n];
       int[] b=new int[n];
       for(int i=0;i<n;i++)
       {
           a[i]=in.nextInt();
       }
       
      for(int i=n-1;i>=0;i--)
      {  
          b[i]=sum/a[i];
          sum=sum%a[i]; 
      }
       for(int i=0;i<n;i++)
       {  
           if(b[i]!=0)
               if(b[i]==1)
              System.out.println(b[i]+"coin of "+a[i]);
           else
                   System.out.println(b[i]+"coins of "+a[i]);
            
       }
       
    }
    
}
