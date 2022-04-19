import java.util.Scanner;
class Evenorodd
  {
    public static void main(String args[])
    {
      int a;
      System.out.println("enter number");
       Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      if(a%2==0)
      {
        System.out.println("even");
      }
      else
      {
        System.out.println("odd");
      }
    }
  }