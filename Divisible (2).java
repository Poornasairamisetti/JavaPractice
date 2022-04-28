import java.util.Scanner;
class Divisible
  {
    public static void main(String args[])
    {
    System.out.println("enter the array element");
   int a[]=new int[5];
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<5;i++){
          a[i]=sc.nextInt();
        }
      System.out.println("enter the elents are");
      for(int i=0;i<5;i++)
          if(a[i]%5==0)
            System.out.println(a[i]);
          }
          }