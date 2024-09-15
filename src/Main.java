//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dispenser dispenser=new Dispenser("Mydispenser");
       Thread cook1=new Thread(new Cooker("cooker1",dispenser));
       Thread cook2=new Thread(new Cooker("cooker2",dispenser));
       cook1.start();
       cook2.start();
       Thread pop1=new Thread(new RobotArm(dispenser));
       Thread pop2=new Thread(new RobotArm(dispenser));
       Thread pop3=new Thread(new RobotArm(dispenser));
       pop1.start();
       pop2.start();
       pop3.start();

       try {
          pop1.join();
          pop2.join();
          pop3.join();
       }catch (InterruptedException ex){
           System.out.println("Fuc''''''''");
       }
    }
}