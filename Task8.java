abstract class Animal
{
    abstract void sleep();
    abstract void eat();
    void sound()
    {
        System.out.println("this animal sound");
    }
   
}

class Cow extends Animal
{
    @Override void eat()
    {
        System.out.println("Cow is is eating");
    }
    @Override void  sleep()
    {
        System.out.println("cow");
    }
    @Override  void sound()
    {
        System.out.println("this Cow sound");
    }
}
class Lion extends Animal
{
    @Override void  sleep()
    {
        System.out.println("Loin");
    }
    @Override  void sound()
    {
        System.out.println("this Loin sound");
    }
    @Override void eat()
    {
        System.out.println("Loin is is eating");
    }
}

public class Task8 {
    public static void main(String[] args) {
        Animal [] zoo={new Cow(),new Lion()};
      for (Animal animal : zoo) {
        animal.eat();
        
      }
}