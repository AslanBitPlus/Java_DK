package S2;

import java.io.BufferedInputStream;
import java.io.DataInputStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание - 3.1");
        Task1<String, DataInputStream, Integer> task1 = new Task1<>("Text",
                new DataInputStream(System.in), 9);

        task1.print();
    }
}
