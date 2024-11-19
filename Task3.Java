class Vehicle{
    private int speed;
    Vehicle(int S)
    {
        this.speed=S;
    }
    void Run()
    {
        System.out.println("Run() funtion is running");
    }
 void Display()
 {
    System.out.println("The Speed is :"+this.speed);
 }
    
}
class Bike extends Vehicle {

    void ringBell()
    {
        System.out.println("RingBell is called...");
    }
    Bike(int S)
    {
        super(S);
    }
}


public class Task3 {

    public static void main(String[] args) {
        Bike mybike=new Bike(123);
        mybike.Run();
        mybike.ringBell();
        mybike.Display();
    }
}
