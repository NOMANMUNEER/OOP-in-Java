 class Vehicle{
    private int speed;
    void Run()
    {
        System.out.println("Run() funtion is running");
    }

    
}
class Bike extends Vehicle {

    void ringBell()
    {
        System.out.println("RingBell is called...");
    }
}


public class Task2 {

    public static void main(String[] args) {
        Bike mybike=new Bike();
        mybike.Run();
        mybike.ringBell();
    }
}
