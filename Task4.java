class Bird
{
void fly()
{
System.out.println("All bird fly...");
}
}
class Penguin extends Bird
{
   @Override void fly()
    {
        System.out.println("Penguins cannot fly.");
    }
}
public class Task4 {
    public static void main(String[] args) {
        Penguin p1=new Penguin();
        p1.fly();
        Bird b1=new Bird();
        b1.fly();
    }
}
