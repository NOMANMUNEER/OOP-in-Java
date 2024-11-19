interface Playable {
  public  void Play();

    
}
interface AdvancedPlayable extends Playable
{    
     public void Pused();
    
}

class Songs implements AdvancedPlayable
{
    @Override
    public void Play() {
        System.out.println("Playing a beautiful song!");
    }
    @Override
    public void Pused()
    {
        System.out.println("Pused a beautiful song!");
    }
}
public class Task10 {
    public static void main(String[] args) {
        Songs S1=new Songs();
        S1.Play();
        S1.Pused();
        
    }
}
