import java.util.Vector;

public class Dispenser {
    Vector<Popcorn> qeue= new Vector<Popcorn>();
    private String name;
    public Dispenser(String name) {
        this.name= name;
    }

    public  synchronized void  add(Popcorn popcorn) throws InterruptedException,ItemNotFoundException{
         while (this.qeue.size()>=3){
             this.wait();                    //this.queue.size() >= this.capacity
         }
         this.qeue.add(popcorn);
        System.out.println("i made it by "+this.name);
         this.notifyAll();

    }
    public  synchronized void  remove() throws InterruptedException,ItemNotFoundException{
        while (this.qeue.isEmpty()){
            this.wait();
        }
        this.qeue.remove(0);
        System.out.println("i got it");
        this.notifyAll();
    }
}
