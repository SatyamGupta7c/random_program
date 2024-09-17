import java.util.*;
public class AP 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("First number of AP = ");
        double a= sc.nextDouble();
        System.out.print("Common difference = ");
        double d= sc.nextDouble();
        System.out.print("Nth term = ");
        double n= sc.nextDouble();
        double sn=0;
        System.out.print("The progression is = ");
        for(int i=1;i<=n;i++)
        {
            sn+=a;
            System.out.print(a+" ");
            a+=d;
        }
        System.out.println();
        System.out.println("Sum of the AP = "+sn);
    }
}
