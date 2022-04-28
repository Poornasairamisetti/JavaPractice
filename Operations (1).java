import java.util.Scanner;
class Staticatm
 
  {
 
    int balance=12000;
    int amount;
    Scanner sc =new Scanner(System.in);
    //withdraw method
   void  withdraw ( int amount)
    {
     
      if(amount%100==0)
      {
        if(balance>amount)
        {
          balance= balance-amount;
          System.out.println("Withdraw Sucessful");
        }
        else{
          System.out.println("Insufficient Balance");
        }
      }
    }
    //deposite method
    void deposite( int amount)
    {
   
     
    if(amount%100==0)
      {
        balance= balance+amount;
        System.out.println("the balance is "+balance);
      }
     else{
        System.out.println("Wrong input amount");
      }
    }
   void  balance()
    {
     System.out.println("the balance is eual to : "+balance);
     
    }
  }
class Operations
  {
    public static void main(String [] args)
    {
     
     
    Scanner sc = new Scanner(System.in);
      int a;
      int amt;
      char ch;
   
       Staticatm atm = new Staticatm();
      do
      {
      System.out.println("1.Withdraw\n 2.Deposite \n 3.Balance enquire");
     
      System.out.println("Enter respective operation number ");
      a=sc.nextInt();
      switch(a)
        {
          case 1:
            System.out.println("Enter the amount");
                 amt =sc.nextInt();
           
            atm.withdraw(amt);
           
            break;
          case 2:
            System.out.println("Enter the amount");
             amt= sc.nextInt();
           
            atm.deposite(amt);
            break;
          case 3:
           
            atm.balance();
            break;
          default:
            System.out.println("select valid option");
        }
        System.out.println("Do you want to continue");
        ch=sc.next().charAt(0);
        }
         
        while(ch=='y');
     
    }
  }
