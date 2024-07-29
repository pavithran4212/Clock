import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MyClock implements Runnable {
   public void run() {
        DateTimeFormatter d = DateTimeFormatter.ofPattern("hh:mm:ss");
        while (true) {
            try{
                Thread.sleep(1000);
                LocalTime currenTime =  LocalTime.now();
                
                System.out.println(d.format(currenTime));
                System.out.flush(); 

            } catch( InterruptedException e){
                System.out.println(e.getMessage());
            }
           
        }
    }
    public static void main(String[] args) {
        MyClock clock = new MyClock();
        Thread t = new Thread(clock);
        t.start();
    }
}
