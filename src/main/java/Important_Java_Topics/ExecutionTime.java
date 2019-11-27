package Important_Java_Topics;


import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 * Program to get the execution time of the Java programs
 * </p>
 *
 */
public class ExecutionTime
{
    public static void main(String[] args) throws InterruptedException {
        /**
         * Three ways
         */

        System_CurrentTime();
        System_NanoTime();
        Instant_Class();

    }

    static void System_CurrentTime() throws InterruptedException {
// using the System.currentTimeMillis().
        long start=System.currentTimeMillis();
        Thread.sleep(2500);
        long end=System.currentTimeMillis();
        long dur=end-start;
        System.out.println("Time took for execution :" +dur);

    }


    static void System_NanoTime() throws InterruptedException {
// using the System.nanoTime().
     long start=System.nanoTime();
     Thread.sleep(3000);
     long end=System.nanoTime();
     long dur=(end-start)/1000000000;
     System.out.println("Time took for execution :" +dur+ "  seconds");
  // or
     long durSec= TimeUnit.NANOSECONDS.toSeconds(end-start);
     System.out.println("Time took for execution in seconds :"+durSec);

    }

    static void Instant_Class() throws InterruptedException {
// using the Instant Class now method.
        Instant start=Instant.now();
        Thread.sleep(4500);
        Instant end=Instant.now();
        System.out.println("Time took for execution : "+ Duration.between(start,end));

    }

}
