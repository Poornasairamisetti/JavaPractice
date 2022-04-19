/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

class Operations {
public static void main(String args[])
  {
    Scanner sc=new Scanner (System.in);
    System.out.println("enter first num: ");
    int a=sc.nextInt();
    System.out.println("enter second num: ");
    int b=sc.nextInt();
     int c=a-b;
    int d=a*b;
    int e=a/b;
    int f=a++;
    int g=a--;
    int h=a%b;
    System.out.println("Difference of 2 numbers "+c);
    System.out.println("Product of 2 numbers "+d);
    System.out.println("Division of 2 numbers "+e);
    System.out.println("Increment of 2 numbers "+f);
    System.out.println("Decrement of 2 numbers "+g);
    System.out.println("Remainder of 2 numbers "+h);
  }

//main method

/*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*
  Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/

//calculate difference,product,division,increment and remainder 

//print appropriate result for all operations

}