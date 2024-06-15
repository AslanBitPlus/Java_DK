package S2;

import java.io.DataInput;
import java.io.InputStream;

public class Task1<T extends Comparable<String>, //
        V extends InputStream & DataInput,      //
        K extends Number> {                     //
    // Описание обобщенных переменных
    T t;
    V v;
    K k;
    // Конструктор (Alt + insert)
    public Task1(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }
    // Getter (Alt + insert)
    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }
    // Метод вывода в консоль
    public void print() {
        System.out.printf("T: %s, V: %s, K: %s", t.getClass().getName(),
                v.getClass().getName(), k.getClass().getName());

        // System.out.printf("T: %s, V: %s, K: %s", t.getClass().getSimpleName(),
        //        v.getClass().getSimpleName(), k.getClass().getSimpleName());
    }
}
