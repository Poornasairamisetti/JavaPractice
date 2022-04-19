import java.util.Scanner;
class Alphabetornot
  {
    public static void main(String args[])
    {
      char ch;
      System.out.println("enter the character: ");
      Scanner sc=new Scanner(System.in);
      ch=sc.next().charAt(0);
       if((ch>=97&&ch<=122)||(ch>=65&&ch<=90))
      {
        System.out.println("it is a CHARACTER");
      }
      else
       {
         System.out.println("it is not a CHARACTER");
       }
    }
  }