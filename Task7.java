abstract class Animal
{
    abstract void sleep();
    void sound()
    {
        System.out.println("this animal sound");
    }
   
}

class Cow extends Animal
{
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
}

public class Task7 {
    public static void main(String[] args) {
        Animal [] zoo={new Cow(),new Lion()};
        zoo[0].sound();
        zoo[1].sound();
    }
}