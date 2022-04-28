import java.util.Scanner;
class Sumeven
  {
   
    public static void main(String args[])
    {
      int sum=0;
    System.out.println("enter the array element");
   int a[]=new int[10];
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<5;i++){
          a[i]=sc.nextInt();
        }
      System.out.println("enter the elents are");
      for(int i=0;i<5;i++)
        {
          if(a[i]%2==0){          
          sum=sum+a[i];
            }
          }
      System.out.println(sum);
  }
  }