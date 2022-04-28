class animal
  {
    void animal_sound()
    {
      System.out.println("sound");
    }
  }
class Cat extends animal
  {
    void animal_sound()
      {
        System.out.println("meow meow");
      }
  }
class dog extends Cat
  {
    void animal_sound()
    {
      System.out.println("bow bow");
    }
  }
class Overriding
  {
  public static void main(String args[])
  {
    Cat c=new Cat();
      c.animal_sound();
  }
  }