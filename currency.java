import java.util.*;
public class currency {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int count=0,j=1,k=0;
        System.out.println("Enter amount");
       int sum=in.nextInt();
       int[] a={1,10,50,100,500};
       int n=a.length;
       int[] b=new int[a.length];
      for(int i=n-1;i>=0;i--)
      {  
          b[i]=sum/a[i];
          sum=sum%a[i]; 
      }
       for(int i=0;i<n;i++)
       {  
           count=count+b[i];
       }
        System.out.println(count+" currency notes");
       
    }
    
}
