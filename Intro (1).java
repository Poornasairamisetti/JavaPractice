import java.util.Scanner;
class Intro
  {
    public static void main(String args[])
    {
    System.out.println("enter the array element");
   int a[]=new int[5];
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<5;i++){
          a[i]=sc.nextInt();
        }
      System.out.println("the elements are");
      for(int i=0;i<5;i++)
      System.out.println(a[i]);
    }
}
