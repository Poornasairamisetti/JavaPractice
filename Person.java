import java.util.Scanner;
class person
  {
    String name;
    int age;
    void persondetails()
    {
      System.out.println("enter the details");
    }
  }
class Student extends person
  {
    String name;
    int idno;
    String dept;
      void Studentdetails()
    {
      System.out.println("enter the student ");
    }
  }
class Employee extends person
  {
    int id;
    String name;
    String designation;
    
  }
class Graduated extends Student
  {
    String mtech;
    void graduateddetails()
    {
      System.out.println("graduated");
    }
  }
class postGraduated extends Student
  {
    String mtech;
    void graduateddetails()
    {
    System.out.println("post graduated");
    }
  }
    class masters extends postGraduated
      {
        String mba;
        void mbadetails()
        {
        System.out.println("yes"+mba);
      }
      }
    class phd extends postGraduated
    {
    String ms;
      void msdetails()
      {
        System.out.println("yes"+ms);
      }
    }
class faculty extends Employee
  {
    int id;
    void facultydetails()
    {
    System.out.println("facultydetails"+id);
}
  }
    class Staff extends Employee
      {
        int id;
        void staffdetails()
        {
        System.out.println("staff");
    }
      }
class Person
  {
    public static void main(String args[])
    {
      Student st=new Student();
      String a= st.name="fdgggeg";
     int  b=st.age=23;
     int  c=st.idno=34;
     String d=st.dept="ece";
      System.out.println(a+" "+b+" "+c+" "+d);
    }
  
  }