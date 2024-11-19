interface Playable {
    void Play();

    
}
class Song implements Playable {
    @Override
    public void Play() {
        System.out.println("Playing a beautiful song!");
    }
}


public class Task9 {
    public static void main(String[] args) {
        Song S1=new Song();
        S1.Play();
    }
}
