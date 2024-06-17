package DZ;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Philosopher extends Thread{
    private static boolean readyEat;
    private String name;
    private static Random random = new Random();
    private int numEat;
    private int numPhil;


    public Philosopher(String name, int numEat, int numPhil) {
        this.name = name;
        this.numEat = numEat;
        this.numPhil = numPhil;
    }

    @Override
    public void run() {
        try {
            if (numEat != 0) {
                Spoon.findSpoon(numPhil - 1);
                toEat();
                Spoon.phil[numPhil - 1] = 0;
                toSmart();
                numEat--;
                // Spoon.findSpoon(numPhil - 1);
            } else {
                System.out.println(name + " завершил свою миссию!");

            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



    public void toEat() throws InterruptedException {
        System.out.println(name + " начал есть.");
        sleep(random.nextLong(1000, 3000));
        System.out.println(name + " поел " + numEat + "-й раз");
        // cdl.countDown();
    }

    public void toSmart() throws InterruptedException {
        System.out.println(name + " умничает......");
        sleep(random.nextLong(1000, 3000));
        System.out.println(name + " перестал умничать!");
    }

}
