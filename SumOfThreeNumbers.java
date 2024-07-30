package NewDemoFromLocalToRemote;



import java.util.*;

public class SumOfThreeNumbers
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter 3 numbers");
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();

 if(a>b && a>c)
    System.out.println("largest number:"+a);
else if(b>a && b>c)
 System.out.println("largest number:"+b);
else
  System.out.println("largest number:"+c);

}
}