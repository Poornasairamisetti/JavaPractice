import java.util.Scanner;
class Factorialnum
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the range");
      int n=sc.nextInt();
      for(int i=1;i<n;i++)
        {
          if(n%i==0)
          {
            System.out.println(i);
          }
        }
      }
  }