import java.util.*;
public class seed{

    public static void main(String[] args) {

       Scanner in=new Scanner(System.in);
 int y=in.nextInt();
 int x=in.nextInt();
 int sum=y;   
 while(y!=0)
 {
     int r=y%10;
     sum=sum*r;
     y=y/10;
 }
 if(sum==x)
            System.out.println("Seed");
 else
            System.out.println("Not Seed");
    }
}
