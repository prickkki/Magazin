import java.util.*;
public  class TimpulDeFunctionare implements Runnable{
    public void run () {
        long startTime = System.nanoTime();
        while(true) {
                try {
                    Thread.sleep(120000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                long endTime = System.nanoTime();
                long timeSecunde = (endTime-startTime)/1000000000;
                long timeMinute = timeSecunde/60;
                System.out.println("Timpul de functionare este:"+ timeMinute +" minute");
        }
    }
}
