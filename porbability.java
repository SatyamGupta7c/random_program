import java.util.*;
public class porbability 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Number of faces on the dice = ");
        int a= sc.nextInt();
        System.out.print("The sum you want to get = ");
        int b= sc.nextInt();
        System.out.print("Total number of dice rolled = ");
        int c= sc.nextInt();
        int total_cases= (int)Math.pow(a,c);
        int sum=0,d=0;
        for(int i=1,i<=c;i++)
        {
            for(int j=1,j<=a;j++)
            {
                for(int k=1;k<=a;k++)
                {

                }
            }
        }
    }
}
