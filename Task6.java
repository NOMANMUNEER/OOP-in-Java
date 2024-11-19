public class Task6 {
    public static void main(String[] args) {
        
        Bird B1=new Penguin();
        B1.fly();
    }
}
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

