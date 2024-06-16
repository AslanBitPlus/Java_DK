package S1;

/*
Задание 1
В рамках выполнения задачи необходимо:
● Создать два класс ObjectA, ObjectB
● Реализовать класс в котором два потока при запуске провоцируют DeadLock для
объектов ObjectA, ObjectB
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание - 5.1");

        Object objectA = new Object();
        Object objectB = new Object();

        Thread threadA = new Thread(() -> {
            synchronized (objectA) {
                System.out.println("ThreadA");
                synchronized (objectB) {
                    System.out.println("MonitorB");
                }
            }
        });

        Thread threadB = new Thread(() -> {
            synchronized (objectB) {
                System.out.println("ThreadB");
                synchronized (objectA) {
                    System.out.println("MonitorA");
                }
            }
        });

        threadA.start();
        threadB.start();
    }
}
