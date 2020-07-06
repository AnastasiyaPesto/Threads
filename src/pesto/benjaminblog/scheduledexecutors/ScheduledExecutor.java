package thread.scheduledexecutors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutor {
  public static void main(String[] args) throws InterruptedException {
    ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

    Runnable task = () -> System.out.println("Scheduling: " + System.nanoTime());
    ScheduledFuture<?> future = executor.schedule(task, 3, TimeUnit.SECONDS);

    TimeUnit.MILLISECONDS.sleep(1337);

    long remaningDelay = future.getDelay(TimeUnit.MILLISECONDS);
    System.out.printf("Remaning Delay: %sms \n", remaningDelay);
  }
}
