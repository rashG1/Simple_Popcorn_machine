public class RobotArm implements  Runnable{
    Dispenser dispenser;
    public RobotArm(Dispenser dispenser){
        this.dispenser=dispenser;
    }
    public void run(){
        try{
            this.dispenser.remove();

        }catch (InterruptedException e){
            System.out.println("problem ");
        }catch (ItemNotFoundException ex){
            System.out.println("problem here");
        }
    }
}
