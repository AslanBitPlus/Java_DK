package S2;

public class Main {

    static volatile Boolean switcher = false;

    public static void main(String[] args) {
        // System.out.println("Задание - 5.2");
        Thread changer = new Thread(() -> {
            while (true) {
                switcher = !switcher;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread counter = new Thread(() -> {
            int count = 100;
            while (count >= 0) {
                if (switcher) {
                    System.out.println(Thread.currentThread().getName() + " " + count--);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // System.out.println("==================");

            }
        });

        changer.start();
        counter.start();


    }
}
