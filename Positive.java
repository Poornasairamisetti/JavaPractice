import java.util.Scanner;
class Positive
  {
    public static void main(String args[])
    {
      int a;
      System.out.println("enter number");
       Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      if(a>0)
      {
        System.out.println("positive");
      }
      else
      {
        System.out.println("negative");
      }
    }
  }