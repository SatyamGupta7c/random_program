import java.util.*;

public class perfect_number 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b=0,c=0;
        for(int i=1;i<=a;i++)
        {
            b=a%i;
            if(b==0)
            {
                System.out.print(i+" ");
                if(i!=a)
                {
                    c=c+i;
                }
            }
        }
        System.out.println();
        if(c==a)
        {
            System.out.println(a+" is a perfect number");
        }
        else
        {
            System.out.println(a+" is not a perfect number");
        }
    }
}
