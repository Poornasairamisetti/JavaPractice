import java.util.Scanner;
class Vowel
  {
    public static void main(String args[])
    {
      int ch;
      System.out.println("enter character");
       Scanner sc=new Scanner(System.in);
       ch=sc.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='I'||ch=='O'||ch=='U'||ch=='E')
      {
        System.out.println("vowel");
      }
      else
      {
        System.out.println("conconent");
      }
    }
  }