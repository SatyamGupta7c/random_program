import java.util.*;
class practice
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number you want factorial of");
        int a= sc.nextInt();
        int i=1;
        int f=1;
        while(i<=a)
        {
            f=f*i;
            i++;
        }
        System.out.println("Factorial of "+a+" is "+f);
    }
}