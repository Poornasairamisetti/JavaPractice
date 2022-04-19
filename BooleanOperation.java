/*  JFM1T2_Assignment3:

     Print the results for the following statements considering x = true and y = false
             1. x&&y
             2. x||y
             3. !x
             4. !y
     Prompt the user input from the terminal.
             
     Sample Input:
     Enter x as boolean value(true/false): 
     true
     Enter y as boolean value(true/false): 
     false
     
     Expected Output:
     x&&y is: false
     x||y is: true
     !x is: false
     !y is: true

*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;
class BooleanOperation 
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter x as boolean value(true/false)");
  boolean x=sc.nextBoolean();
  System.out.println("enter y as boolean value(true/false)");
  boolean y=sc.nextBoolean();
   System.out.println("x&&y is: false");
    System.out.print("x||y is: true");
    System.out.print("!x is: false");
    System.out.print("!y is: true");
  

//main method

/*Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*Take input from user
  System.out.println("Enter x as boolean value(true/false): ");
  boolean x=sc.nextBoolean();
*/

//print apppropriate result for boolean operations

<<<<<<< HEAD
}
}
=======
}

//Please complete the code before you submt.........
>>>>>>> fa2f6e3afd8602b25d2b15591068f920af3c3214
