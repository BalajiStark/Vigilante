import java.util.*;

class Friends 
{
     public static void main(String[] args)
    {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
           a[i]=in.nextInt();
       }
       Arrays.sort(a);
       Set<Integer> st=new TreeSet<Integer>();
       int flag=0;
       for(int i=0;i<n;i++)
       {
           for(int j=i+1;j<n;j++)
           {
               if(a[i]==a[j])
                   st.add(a[i]);
           }
       }
       if(st.size()==0)
       {
           System.out.println("unique");
       }
       else
       {
           
               System.out.println(st);
       }
    }
}
