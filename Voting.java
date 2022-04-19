import java.util.Scanner;
class Voting
  {
    public static void main(String args[])
    {
      int age;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter person age");
      age=sc.nextInt();
      if(age>=18)
      {
        System.out.println("eligible for voting");
      }
      else
      {
        System.out.println("not eligible for voting");
      }
    }
  }