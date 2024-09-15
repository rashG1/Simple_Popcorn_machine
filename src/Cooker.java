public class Cooker implements  Runnable{
    String name;
    Dispenser dispenser;
    public Cooker(String name,Dispenser dispenser) {
        this.name = name;
        this.dispenser=dispenser;
    }
    public void run() {
        while (true) {
            try {
                dispenser.add(new Popcorn());

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ItemNotFoundException ver) {
                System.out.println("ggooo");
            }
        }
    }

}
