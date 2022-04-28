import java.util.Scanner;
class Count
  {
    public static void main(String args[])
    {
      int count=0,i;
    System.out.println("enter the array element");
   int a[]=new int[10];
      Scanner sc=new Scanner(System.in);
      for( i=0;i<5;i++){
          a[i]=sc.nextInt();
        }
      System.out.println("enter the elements are");
      for( i=0;i<5;i++)
        {
          if(a[i]<0)
          {  
            count++;
              }
          }
          System.out.println(count);
            }
          }
  
  