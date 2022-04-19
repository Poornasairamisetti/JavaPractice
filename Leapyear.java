import java.util.Scanner;
class Leapyear
  {
    public static void main(String args[])
    {
      boolean a;
      System.out.println("enter number");
       Scanner sc=new Scanner(System.in);
      a=sc.nextboolean();
      if(a%=0||a%=400)
      {
        System.out.println("leapyear");
      }
      else
      {
        System.out.println("not a leapyear");
      }
    }
  }