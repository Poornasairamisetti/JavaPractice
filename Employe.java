class Employe
  {
    String Ename;
    int Esalary;
    int Eid;
    String Edept;
    public static void main(String args[])
    {
      Employe st1=new Employe();
      st1.Ename="raghu";
      st1.Esalary=50000;
      st1.Eid=118;
      st1.Edept="civil";
      Employe st2=new Employe();
      st2.Ename="babu";
      st2.Esalary=50000;
      st2.Eid=313;
      st2.Edept="mech";
      Employe st3=new Employe();
      st3.Ename="thu";
      st3.Esalary=50000;
      st3.Eid=207;
      st3.Edept="EEE";
      System.out.println(st1.Ename+" "+st1.Esalary+" "+st1.Eid+" " +st1.Edept);
      System.out.println(st2.Ename+" "+st2.Esalary+" "+st2.Eid+" "+st2.Edept);
      System.out.println(st3.Ename+" "+st3.Esalary+" "+st3.Eid+" "+st3.Edept);
    }
  
  }