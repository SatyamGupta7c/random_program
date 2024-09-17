public class p_9 
{
    public static void main(String args[])
    {
        int a=1;
        for(int i=5;i>=1;i--)
        {
            if(i==5)
            {
                System.out.println("123454321");
            }
            else
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(j);
                }
                for(int j=1;j<=a;j++)
                {
                    System.out.print(" ");
                }
                for(int j=i;j>=1;j--)
                {
                    System.out.print(j);
                }
                System.out.println();
                a=a+2;
            }
        }
    }
}
