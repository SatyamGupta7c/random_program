import java.util.*;
class calculator
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        System.out.println("\nPress 1 for addition");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for division");
        System.out.println("Press 5 for remainder");
        int operation= sc.nextInt();
        double answer;
        switch(operation)
        {
            case 1:
            answer=a+b;
            System.out.println("Addition of a and b is "+answer);
            break;
            case 2:
            answer=a-b;
            System.out.println("Subtraction on a and b is "+answer);
            break;
            case 3:
            answer=a*b;
            System.out.println("Multlipication of a and b is "+answer);
            break;
            case 4:
            answer=a/b;
            System.out.println("Division of a and b is "+answer);
            break;
            case 5:
            answer=a%b;
            System.out.println("Remainder of a and b is "+answer);
            break;
            default:
            System.out.println("Invalid button");
        }
    }
}