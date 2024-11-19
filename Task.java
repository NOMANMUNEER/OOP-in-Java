class Applince
{
    private String brand;

    Applince(String Name)
    {
        this.brand=Name;
    }
 void Turn_on()
 {
    System.out.println("System is started...");
 }
}
class WashingMachine extends Applince
{
    void washClothes()
    {
        System.out.println("Washing a clothes..");
    }
    
    WashingMachine(String Name)
    {
        super(Name);
    }
}
class Refrigerator extends Applince {
    void KeepCool()
    {
        System.out.println("Now Sysem is cooled.");
    }
    Refrigerator(String Name)
    {
        super(Name);
    }
}
public class Task1
{
    public static void main(String []Args)
    {
        WashingMachine obj1=new WashingMachine("Treeby");
        Refrigerator obj2=new Refrigerator("ref2");
        obj1.Turn_on();
        obj2.Turn_on();
        obj2.KeepCool();
        obj1.washClothes();

    }
}
