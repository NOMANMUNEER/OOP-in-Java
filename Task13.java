interface Chargeable
{
   public void charge();
   final int score=10;
  
}
interface Usable
{
    public void use();
    final int score=12;
}

class Smartphone implements Chargeable,Usable
{
    Smartphone()
    {
        System.out.println(Usable.score);
    }
    @Override
   public void charge()
    {
        System.out.println("Smart phone is charging.....");
    }
    @Override
    public void use()
     {
         System.out.println("Smart phone is using.....");
     }

}
public class Task13 {
    public static void main(String[] args) {
        Smartphone LG=new Smartphone();
        LG.charge();
    }
    
}
