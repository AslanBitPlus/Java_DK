package S2;

import java.util.*;
import java.util.stream.Collectors;

/*
Задание 2
В рамках выполнения задачи необходимо:
● Создайте коллекцию мужских и женских имен с помощью интерфейса List -
добавьте повторяющиеся значения
● Получите уникальный список Set на основании List
● Определите наименьший элемент (алфавитный порядок)
● Определите наибольший элемент (по количеству букв в слове но в обратном
порядке)
● Удалите все элементы содержащие букву ‘A’

 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 4.1");
        List<String> names = createListNames();
        System.out.println("List - " + names);

        Set<String> set = new HashSet<>();
        set.addAll(names);

        System.out.println("Set - " + set);

        System.out.println("Max - " + maxValSet(set));
        System.out.println("Min - " + minValSet(set));

        System.out.println("MaxLength - " + maxLengthValSet(set));

        System.out.println("SetWithoutA - " + getSetWithOutA(set));


    }

    private static  List<String> createListNames() {
        List<String> list = new ArrayList<>();
        list.add("Костя");
        list.add("Василий");
        list.add("Семен");
        list.add("Кирилл");
        list.add("Сергей");
        list.add("Семен");
        list.add("Маша");
        list.add("Наташа");

        return list;
    }


    public static String maxValSet(Set<String> set) {
        return set.stream().max(Comparator.naturalOrder()).orElse(null);
    }

    public static String minValSet(Set<String> set) {
        return set.stream().min(Comparator.comparingInt(String::length)).orElse(null);
    }

    public static String maxLengthValSet(Set<String> set) {
        return set.stream().min(Comparator.naturalOrder()).orElse(null);
    }

    public static Set<String> getSetWithOutA(Set<String> st) {
        Set<String> result = st;
        // 1 Способ
        return result.stream().filter(o -> !o.toLowerCase().contains("а"))
           .collect(Collectors.toSet());
        // 2 Способ
        // return result.stream().filter(o -> !o.contains("А") && !o.contains("а")).collect(Collectors.toSet());

    }
}
