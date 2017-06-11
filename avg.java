import java.util.*;
public class avg {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int temp=0,temp1=1,j,k,flag=0;
       int[] a=new int[n];
       for(int i=0;i<n;i++)
       {
           a[i]=in.nextInt();
       }
       Arrays.sort(a);
       for(int i=0;i<n;i++)
       {  
           for(j=0;j<i+1;j++)
           {
               temp=temp+a[i];
           }
           for(k=j+1;k<n;k++)
           {
               temp1=temp1+a[k];
           }
           int s=i+1;
           int s1=n-1;
           if((temp%s)==(temp1%(s1)))
           {  flag=1;
           break;
           }
       }
       if(flag==1)
            System.out.println("true");
       else
            System.out.println("false");
    }
    
}
