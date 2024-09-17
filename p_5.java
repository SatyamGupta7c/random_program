public class p_5 
{
    public static void main(String args[])
    {
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=(5-i);j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--)
            {
                System.out.print(k);
            }
            for(int l=2;l<=i;l++)
            {
                System.out.print(l);
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=(5-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}