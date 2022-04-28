class Student
  {
    String name;
    int rollno;
    String branch;
    public static void main(String args[])
    {
      Student st1=new Student();
      st1.name="sai";
      st1.rollno=423;
      st1.branch="ECE";
      
      Student st2=new Student();
      st2.name="sowmya";
      st2.rollno=108;
      st2.branch="civil";
      System.out.println(st1.name+" "+st1.rollno+" "+st1.branch);
      System.out.println(st2.name+" "+st2.rollno+" "+st2.branch);
      }
  }