import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new myRunnable(), "worker-1");
        Thread thread2 = new Thread(new myRunnable(), "worker-2");

        // timed-input thread:
        Thread thread3 = new Thread(() -> {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            long deadline = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(5);

            System.out.println("You have 5 seconds to enter your name:");

            String name = null;
            try {
                while (System.currentTimeMillis() < deadline) {
                    if (reader.ready()) {
                        name = reader.readLine();
                        break;
                    }
                    // avoid busy‑spin
                    Thread.sleep(100);
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }

            if (name != null && !name.isEmpty()) {
                System.out.println("Hello, " + name + "!");
            } else {
                System.out.println("⏰ Timeout! No name entered within 5 seconds.");
            }
        }, "timed-input");

        // start all three in parallel:
        thread1.start();
        thread2.start();
        thread3.start();

        // wait for everyone to finish:
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
