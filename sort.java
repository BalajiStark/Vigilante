import java.util.*;
public class sort{

    public static void main(String[] args) {

       Scanner in=new Scanner(System.in);
 int n=in.nextInt(),sum=0,flag=0,k=0;
 int[] a=new int[n];
 int[] b=new int[n];
 int[] c=new int[n];
 int[] d=new int[n];
 for(int i=0;i<n;i++)
 {
    a[i]=in.nextInt();
 }
 for(int i=0;i<n;i++)
 {
     int y=a[i];
     while(y!=0)
     {
         int r=y%2;
         if(r==1)
             sum=sum+1;
         y=y/2;
     }
   c[i]=sum;
   b[i]=sum;
     sum=0;
 }
 Arrays.sort(b);
  for(int i=n-1;i>=0;i--)
  {
      for(int j=n-1;j>=0;j--)
      {
          if(b[i]==c[j] && flag==0)
          {   c[j]=999;
             
          d[k++]=a[j];
              flag=1;
          }
      }
      flag=0;
  } 
        for(int i=0;i<n;i++)
           System.out.println(d[i]);

 
    }
}

