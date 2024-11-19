interface Drivable
{
    public void drive();
}
interface Flyable
{
    public void fly();
}
class Flycar implements Drivable,Flyable{
  
    @Override
    public void drive() {
        System.out.println("Drive the Car..");
        
    }
  
    @Override
    public void fly() {
        System.out.println("Car is flying..");
        
    }
}

public class Task15 {
   public static void main(String[] args) {
   Flycar Fararri=new Flycar();
   Fararri.fly();

   } 
}
