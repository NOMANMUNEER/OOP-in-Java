interface Flyable
{
   public void fly();
}
class Airplane implements Flyable
{
  
    @Override
    public void fly() {
        System.out.println("Aroplane is flying....");
        
    }
}
class Helicopter implements Flyable
{
  
    @Override
    public void fly() {
        System.out.println("Helicopter is flying....");
        
    }
}

public class Task11 {
    public static void main(String[] args) {
        Helicopter h1=new Helicopter();
        h1.fly();
        Airplane A1=new Airplane();
        A1.fly();
    }
}
