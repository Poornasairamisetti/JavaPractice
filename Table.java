import java.util.Scanner;
class Table
  {
    public static void main(String args[])
    {
      int n,i=1,mul;
      System.out.println("enter a number");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      while(i<=10)
        {
        mul=n*i;
      System.out.println(n+"*"+i+"="+mul);
        i++;
    }
  }
  }