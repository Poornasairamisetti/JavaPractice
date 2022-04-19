import java.util.Scanner;
class Positivenegzero
  {
    public static void main (String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the n value ");
      n=sc.nextInt();
      if(n>0)
      {
        System.out.println("positive");
        }
        else if(n==0){
          System.out.println("positive or negative");
        }
      else if(n<0)
      {
        System.out.println("negative ");
      }
      }
  }