import java.util.Scanner;
class Max
  {
    public static void main(String args[])
    {
    System.out.println("enter the array element");
   int a[]=new int[3];
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<3;i++){
          a[i]=sc.nextInt();
        }
      int max=a[0];
      System.out.println("enter the elements are");
      
      for(int i=0;i<3;i++)
        {
          if(a[i]<max){
            max=a[i];
          }
          }
      System.out.println(max);
      }
  }