import java.util.Timer;
import java.util.TimerTask;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Timer : for scheduling tasks
//        Timertask: task that is to be scheduled
        Timer timer  =  new Timer();

        TimerTask task = new TimerTask() {
            int counter = 0;
            @Override
            public void run() {
                System.out.println("hello world");
                counter++;
                if(counter == 10){
                    timer.cancel();
                }
            }

        };
        timer.schedule(task,1000,1000);

    }
}