package DZ;

import java.lang.reflect.Array;
import java.util.concurrent.CountDownLatch;

/*
1. Пять безмолвных философов сидят вокруг круглого стола,
перед каждым философом стоит тарелка спагетти.
2. Вилки лежат на столе между каждой парой ближайших философов.
3. Каждый философ может либо есть, либо размышлять.
4. Философ может есть только тогда, когда держит две вилки — взятую справа и слева.
5. Философ не может есть два раза подряд, не прервавшись на размышления (можно не учитывать)
6. Можно брать только две вилки одновременно

Описать в виде кода такую ситуацию. Каждый философ должен поесть три раза
 */
public class Main {
    public static void main(String[] args) {
        Array[] arr = new Array[5];
        // CountDownLatch cdl = new CountDownLatch(3);

        Philosopher philosopher1 = new Philosopher("Филисоф-1", 3, 1);
        Philosopher philosopher2 = new Philosopher("Филисоф-2", 3, 2);
        Philosopher philosopher3 = new Philosopher("Филисоф-3", 3, 3);
        Philosopher philosopher4 = new Philosopher("Филисоф-4", 3, 4);
        Philosopher philosopher5 = new Philosopher("Филисоф-5", 3, 5);

        Spoon spoon = new Spoon();

        philosopher1.start();
        philosopher2.start();
        philosopher3.start();
        philosopher4.start();
        philosopher5.start();

    }

}
