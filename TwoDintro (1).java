import java.util.Scanner;
class TwoDintro
  {
    public static void main(String args[])
    {
      int i,j;
    System.out.println("enter the array element");
      int a[][]=new int[5][3];
       Scanner sc=new Scanner(System.in);
      for( i=0;i<5;i++){
        for( j=0;j<3;j++)
        {
          a[i][j]=sc.nextInt();
          }
        }
    System.out.println("the array value");
          for( i=0;i<5;i++){
          for(j=0;j<3;j++)
            {
              System.out.println(a[i][j]);
              
            }
            System.out.println();
            }
      }
  }

