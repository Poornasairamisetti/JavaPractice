class Animal
  {
    String color;
    void eat()
    {
      System.out.println("eating");
    }
  }
class Dog extends Inharitance
  {
    String breed;
    void bark()
    {
      System.out.println("barking");
    }
  }
class Cats extends Animal
  {
  void meow()
   {
    System.out.println("meow meow");
   }
  }
class Hierorical
  {
    public static void main(String args[])
    {
      Cats d=new Cats();
      d.color="white";
      System.out.println(d.color+" ");
      d.eat();
      d.meow();
    }
  }
 