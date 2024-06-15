package DZ.T3;

/*
Напишите обобщенный класс Pair, который представляет
собой пару значений разного типа. Класс должен иметь методы
getFirst(), getSecond() для получения значений каждого
из составляющих пары, а также переопределение метода toString(),
возвращающее строковое представление пары.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание - 3.3");

        Pair pair1 = new Pair("Иванов", 2001);
        Pair pair2 = new Pair("Петров", 2002);
        Pair pair3 = new Pair("Сидоров", 2008);

        System.out.println("Фамилия - " + pair1.getFirst());
        System.out.println("Год рождения - " + pair1.getSecond());

        System.out.println("pair1 " + pair1);
        System.out.println("pair2 " + pair2);
        System.out.println("pair3 " + pair3);

    }
}
