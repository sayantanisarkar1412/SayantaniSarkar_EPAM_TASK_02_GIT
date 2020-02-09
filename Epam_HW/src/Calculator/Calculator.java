package Calculator;
import java.util.*;
//import java.io.*;
public class Calculator
{   
    public static void main(String[]args)
    {
        System.out.println("-------Calculator-------");
        Scanner sc=new Scanner(System.in);
        char c;
        do
        {
            System.out.print("Enter 1st operand:");
            double var1=sc.nextDouble();
            
            System.out.print("Enter next operand:");
            double var2=sc.nextDouble();
            System.out.print("Enter operator(+,-,*,/):");
            c=sc.next().charAt(0);
            
            System.out.printf("%f %c %f =",var1,c,var2);
            if(c=='+')System.out.println(add(var1,var2));
            else if(c=='-')System.out.println(sub(var1,var2));
            else if(c=='*')System.out.println(prod(var1,var2));
            else if(c=='/')System.out.println(div(var1,var2));
            else System.out.println("Error unsupported Operator");
            System.out.printf("Press Y to continue:");
            c=sc.next().charAt(0);
            sc.close();
        }while(c=='Y');
    }
    static double add(double var1,double var2)
    {
        return(var1+var2);
    }
    static double sub(double var1,double var2)
    {
        return(var1-var2);
    }
    static double div(double var1,double var2)
    {
        return(var1/var2);
    }
    static double prod(double var1,double var2)
    {
        return(var1*var2);
    }
}
    
    