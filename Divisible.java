import java.util.Scanner;
class Divisible
  {
    public static void main(String args[])
    {
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the n value");
    num=sc.nextInt();
   if((num%5==0)&&(num%11==0))
   {
  System.out.print("divisible :"+num);
   }
   else{
  System.out.println("not divisible :");
   }
}
  }