import java.util.*;
public class removearraay {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int count=0,j=1;
        System.out.println("Enter size");
       int n=in.nextInt();
       int[] a=new int[n];
       int[] b=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Removing element");
        int k=in.nextInt();
         for(int i=0;i<n;i++)
        {
            if(a[i]!=k)
                b[i]=a[i];
        }    
         for(int i=0;i<b.length;i++)
        {   if(b[i]!=0)
            System.out.print(b[i]+" ");
        }     
    
       
    }
    
}
