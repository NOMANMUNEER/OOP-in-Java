interface Readable{
    public void read();
}
interface Writable
{
    public void write();
}
class EBook implements Readable,Writable
{
    @Override 
   public void  read(){
        System.out.println("Reading Ebook...");
    }
     @Override
    public void  write() {
        System.out.println("Reading Ebook...");
    };
}

public class Task12 {
    public static void main(String[] args) {
        EBook book=new EBook();
        book.write();
    }
    
}
