class Computer
{
    void start()
    {
        System.out.println("Computer is Started..");
    }
    void shutdown()
    {
        System.out.println("Computer is power off now.....");
    }
}
class Laptop extends Computer
{
    void start()
    {
        System.out.println("Loptop is Started..");
    }
    void shutdown()
    {
        System.out.println("Loptop is power off now.....");
    }
}


public class Task5 {
    public static void main(String[] args) {
        Computer C1=new Computer();
        Laptop L1=new Laptop();
        C1.start();
        C1.shutdown();
        L1.start();
        L1.shutdown();
    }
}
