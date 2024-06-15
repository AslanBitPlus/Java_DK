package S1;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {    // Ограничение сверху
                                        // В параметр Т может попасть только тип Fruit
                                        // и его наследники
                                        // не важно, что это интерфейс, пишется extends
                                        // тек.класс и его потомки
    // Объявили List для добавления фруктов
    private final List<T> container = new ArrayList<>();
    // Метод добавить фрукт
    void add(T fruit) {container.add(fruit); }
    // Метод печати веса коробки
    /*
    void print() {
        System.out.println(getWeight());
    }

     */
    // Метод Вес коробки
    float getWeight() {
        return (container.isEmpty())
                ? 0 // 0, если нет фруктов
                : container.get(0).getWeight() * container.size();  // Вес 0-го фрукта
                                                                    // * на количество фруктов
    }

    // Метод сравнения веса данной коробки с весом другой
    boolean compare(Box<?> with) {
        return this.getWeight() - with.getWeight() < 0.0001;
    }

    // Метод переложения фруктов из одной коробки в другую
    void transferTo(Box<? super T> dest) {  // Ограничение снизу. В коробку можно
                                            // пересыавть фрукты того же типа что в коробке
                                            // или наследники жтого типа
                                            // типа (в коробку яблок - зеленые яблоки)
                                            // тек.класс и его родители
        dest.container.addAll(container);
        container.clear();
    }


}
